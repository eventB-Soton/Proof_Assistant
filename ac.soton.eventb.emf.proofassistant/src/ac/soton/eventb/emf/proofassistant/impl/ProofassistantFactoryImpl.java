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
package ac.soton.eventb.emf.proofassistant.impl;

import ac.soton.eventb.emf.proofassistant.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProofassistantFactoryImpl extends EFactoryImpl implements ProofassistantFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProofassistantFactory init() {
		try {
			ProofassistantFactory theProofassistantFactory = (ProofassistantFactory)EPackage.Registry.INSTANCE.getEFactory("http://soton.ac.uk/models/eventb/proofassistant/2019"); 
			if (theProofassistantFactory != null) {
				return theProofassistantFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProofassistantFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProofassistantFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProofassistantPackage.PROOF_ASSISTANT: return createProofAssistant();
			case ProofassistantPackage.SELECTION_HINT: return createSelectionHint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProofAssistant createProofAssistant() {
		ProofAssistantImpl proofAssistant = new ProofAssistantImpl();
		return proofAssistant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionHint createSelectionHint() {
		SelectionHintImpl selectionHint = new SelectionHintImpl();
		return selectionHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProofassistantPackage getProofassistantPackage() {
		return (ProofassistantPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProofassistantPackage getPackage() {
		return ProofassistantPackage.eINSTANCE;
	}

} //ProofassistantFactoryImpl
