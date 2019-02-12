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

import ac.soton.eventb.emf.diagrams.Diagram;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.EventBNamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proof Assistant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.proofassistant.ProofAssistant#getComponent <em>Component</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.proofassistant.ProofAssistant#getHints <em>Hints</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#getProofAssistant()
 * @model
 * @generated
 */
public interface ProofAssistant extends EventBNamedCommentedElement, Diagram {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(EventBNamedCommentedComponentElement)
	 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#getProofAssistant_Component()
	 * @model required="true"
	 * @generated
	 */
	EventBNamedCommentedComponentElement getComponent();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.proofassistant.ProofAssistant#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(EventBNamedCommentedComponentElement value);

	/**
	 * Returns the value of the '<em><b>Hints</b></em>' reference list.
	 * The list contents are of type {@link ac.soton.eventb.emf.proofassistant.Hint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hints</em>' reference list.
	 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#getProofAssistant_Hints()
	 * @model required="true"
	 * @generated
	 */
	EList<Hint> getHints();

} // ProofAssistant
