package ac.soton.eventb.emf.proofassistant.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.eventb.emf.proofassistant.Hint;
import ac.soton.eventb.emf.proofassistant.ProofAssistant;
import ac.soton.eventb.emf.proofassistant.SelectionHint;

public class ProofAssitantRule extends AbstractRule implements IRule {
	protected static final EReference components = CorePackage.Literals.PROJECT__COMPONENTS;

	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		if (sourceElement instanceof ProofAssistant)
			return true;		
		else
			return false;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		
		ProofAssistant pa = (ProofAssistant) sourceElement;
		
		EList<Hint> hints = pa.getHints();
		for (Hint hint : hints) {
			if (hint instanceof SelectionHint) {
				SelectionHint selHint = (SelectionHint) hint;
				Event evt = (Event) selHint.getElement();
				EList<EventBElement> selections = selHint.getSelections();
//				// No need to find the project, using null will add it to the current project
//			    ret.add(Make.descriptor(evt, components,grd, 1));
			}
		}
			
        
		
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
