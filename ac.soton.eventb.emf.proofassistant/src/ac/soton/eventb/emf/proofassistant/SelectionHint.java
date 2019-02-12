/**
 * Copyright (c) 2019 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials  are made
 * available under the terms of the Eclipse Public License v1.0 which accompanies this 
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 *
 * $Id$
 */
package ac.soton.eventb.emf.proofassistant;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection Hint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.proofassistant.SelectionHint#getSelections <em>Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#getSelectionHint()
 * @model
 * @generated
 */
public interface SelectionHint extends Hint {
	/**
	 * Returns the value of the '<em><b>Selections</b></em>' reference list.
	 * The list contents are of type {@link org.eventb.emf.core.EventBElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selections</em>' reference list.
	 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#getSelectionHint_Selections()
	 * @model required="true"
	 * @generated
	 */
	EList<EventBElement> getSelections();

} // SelectionHint
