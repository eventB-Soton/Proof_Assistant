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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage
 * @generated
 */
public interface ProofassistantFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProofassistantFactory eINSTANCE = ac.soton.eventb.emf.proofassistant.impl.ProofassistantFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Proof Assistant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proof Assistant</em>'.
	 * @generated
	 */
	ProofAssistant createProofAssistant();

	/**
	 * Returns a new object of class '<em>Selection Hint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Hint</em>'.
	 * @generated
	 */
	SelectionHint createSelectionHint();

	/**
	 * Returns a new object of class '<em>Cases Hint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cases Hint</em>'.
	 * @generated
	 */
	CasesHint createCasesHint();

	/**
	 * Returns a new object of class '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case</em>'.
	 * @generated
	 */
	Case createCase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProofassistantPackage getProofassistantPackage();

} //ProofassistantFactory
