/*******************************************************************************
 * Copyright (c) 2019 University of Southampton.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.proofassistant.generator.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamedCommentedPredicateElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Guard;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;

import ac.soton.emf.translator.TranslationDescriptor;
import ac.soton.emf.translator.configuration.AbstractRule;
import ac.soton.emf.translator.configuration.IRule;
import ac.soton.emf.translator.eventb.utils.Make;
import ac.soton.eventb.emf.proofassistant.SelectionHint;

public class SelectionHintRule extends AbstractRule implements IRule {
	protected static final EReference guards = MachinePackage.Literals.EVENT__GUARDS;

	@Override
	public boolean enabled(final EObject sourceElement) throws Exception  {
		if (sourceElement instanceof SelectionHint)
			return true;		
		else
			return false;
	}

	@Override
	public List<TranslationDescriptor> fire(EObject sourceElement, List<TranslationDescriptor> translatedElements) throws Exception {
		List<TranslationDescriptor> ret = new ArrayList<TranslationDescriptor>();
		 
		SelectionHint hint = (SelectionHint) sourceElement;
		
		// TODO Check if the hint element is event (maybe assert) 
		Event evt = (Event) hint.getElement();
		
		EList<EventBElement> selections = hint.getSelections();
		for (EventBElement selection : selections) {
			// For each predicate element selected, create a theorem in guard
			if (selection instanceof EventBNamedCommentedPredicateElement) {
				EventBNamedCommentedPredicateElement element = (EventBNamedCommentedPredicateElement) selection;
				Guard grd = MachineFactory.eINSTANCE.createGuard();
				grd.setName("_pa_" + element.getName());
				grd.setPredicate(element.getPredicate());
				grd.setTheorem(true);
			    ret.add(Make.descriptor(evt, guards,grd, 1));
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
