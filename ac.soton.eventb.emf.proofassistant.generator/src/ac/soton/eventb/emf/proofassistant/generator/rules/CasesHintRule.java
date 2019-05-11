package ac.soton.eventb.emf.proofassistant.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.emf.proofassistant.Case;
import ac.soton.eventb.emf.proofassistant.CasesHint;

public class CasesHintRule extends AbstractRule implements IRule {

	protected static final EReference events = MachinePackage.Literals.MACHINE__EVENTS;

	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		if (sourceElement instanceof CasesHint)
			return true;		
		else
			return false;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		 
		CasesHint hint = (CasesHint) sourceElement;
		
		// TODO Check if the hint element is event (maybe assert) 
		Event evt = (Event) hint.getElement();
		Machine mch = (Machine) evt.eContainer();
		EList<Case> cases = hint.getCases();
		
		List<Case> pastCases = new ArrayList<Case>();
		for (Case myCase : cases) {
			// For each cases, generate an event corresponding to the case
			String caseName = myCase.getName();
			String casePredicate = myCase.getPredicate();

			// Copy the original event
			Event caseEvent = EcoreUtil.copy(evt);
			// Append the case name to the event label
			caseEvent.setName(evt.getName() + "_" + caseName);
			
			// Create a guard corresponding to the case
			Guard grd = MachineFactory.eINSTANCE.createGuard();
			grd.setName("_pa_" + caseName);
			grd.setPredicate(casePredicate);
			caseEvent.getGuards().add(grd);
			
			// For each past case, create a guard corresponding to it's negation
			for (Case pastCase : pastCases) {
				Guard pastGrd = MachineFactory.eINSTANCE.createGuard();
				pastGrd.setName("_pa_NOT_" + pastCase.getName());
				pastGrd.setPredicate("¬(" + pastCase.getPredicate() + ")");
				caseEvent.getGuards().add(pastGrd);
			}
			
			ret.add(Make.descriptor(mch, events, caseEvent, 1));
			pastCases.add(myCase);
		}
		
		// Create an event corresponding to the negation of all cases
		// Copy the original event
		Event otherEvent = EcoreUtil.copy(evt);
		// Append the case name to the event label
		otherEvent.setName(evt.getName() + "_OTHER");
		// For each past case, create a guard corresponding to it's negation
		for (Case pastCase : pastCases) {
			Guard pastGrd = MachineFactory.eINSTANCE.createGuard();
			pastGrd.setName("_pa_NOT_" + pastCase.getName());
			pastGrd.setPredicate("¬(" + pastCase.getPredicate() + ")");
			otherEvent.getGuards().add(pastGrd);
		}
		ret.add(Make.descriptor(mch, events, otherEvent, 1));

		// Remove the original event
		ret.add(Make.descriptor(mch, events, evt, true));
		
		return ret;	
	}
	
	@Override
	public boolean dependenciesOK(EObject sourceElement, final List<TranslationDescriptor> translatedElements) throws Exception  {
		return true;
	}
	
	@Override
	public boolean fireLate() {
		return false;
	}

}
