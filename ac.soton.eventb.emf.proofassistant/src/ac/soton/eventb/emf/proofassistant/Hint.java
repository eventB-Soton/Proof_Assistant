/*******************************************************************************
 * Copyright (c) 2019 University of Southampton.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.proofassistant;

import org.eclipse.emf.ecore.EObject;

import org.eventb.emf.core.EventBElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.proofassistant.Hint#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#getHint()
 * @model abstract="true"
 * @generated
 */
public interface Hint extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EventBElement)
	 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#getHint_Element()
	 * @model required="true"
	 * @generated
	 */
	EventBElement getElement();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.proofassistant.Hint#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EventBElement value);

} // Hint
