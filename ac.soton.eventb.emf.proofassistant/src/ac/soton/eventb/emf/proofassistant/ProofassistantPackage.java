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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.emf.proofassistant.ProofassistantFactory
 * @model kind="package"
 * @generated
 */
public interface ProofassistantPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proofassistant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/proofassistant/2019";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proofassistant";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProofassistantPackage eINSTANCE = ac.soton.eventb.emf.proofassistant.impl.ProofassistantPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.proofassistant.impl.ProofAssistantImpl <em>Proof Assistant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.proofassistant.impl.ProofAssistantImpl
	 * @see ac.soton.eventb.emf.proofassistant.impl.ProofassistantPackageImpl#getProofAssistant()
	 * @generated
	 */
	int PROOF_ASSISTANT = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Internal Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__INTERNAL_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__INTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__COMPONENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT__HINTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Proof Assistant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROOF_ASSISTANT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.proofassistant.impl.HintImpl <em>Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.proofassistant.impl.HintImpl
	 * @see ac.soton.eventb.emf.proofassistant.impl.ProofassistantPackageImpl#getHint()
	 * @generated
	 */
	int HINT = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.emf.proofassistant.impl.SelectionHintImpl <em>Selection Hint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.emf.proofassistant.impl.SelectionHintImpl
	 * @see ac.soton.eventb.emf.proofassistant.impl.ProofassistantPackageImpl#getSelectionHint()
	 * @generated
	 */
	int SELECTION_HINT = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_HINT__ELEMENT = HINT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_HINT__SELECTIONS = HINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Selection Hint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_HINT_FEATURE_COUNT = HINT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.proofassistant.ProofAssistant <em>Proof Assistant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proof Assistant</em>'.
	 * @see ac.soton.eventb.emf.proofassistant.ProofAssistant
	 * @generated
	 */
	EClass getProofAssistant();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.proofassistant.ProofAssistant#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see ac.soton.eventb.emf.proofassistant.ProofAssistant#getComponent()
	 * @see #getProofAssistant()
	 * @generated
	 */
	EReference getProofAssistant_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.emf.proofassistant.ProofAssistant#getHints <em>Hints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hints</em>'.
	 * @see ac.soton.eventb.emf.proofassistant.ProofAssistant#getHints()
	 * @see #getProofAssistant()
	 * @generated
	 */
	EReference getProofAssistant_Hints();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.proofassistant.Hint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hint</em>'.
	 * @see ac.soton.eventb.emf.proofassistant.Hint
	 * @generated
	 */
	EClass getHint();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.emf.proofassistant.Hint#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see ac.soton.eventb.emf.proofassistant.Hint#getElement()
	 * @see #getHint()
	 * @generated
	 */
	EReference getHint_Element();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.emf.proofassistant.SelectionHint <em>Selection Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Hint</em>'.
	 * @see ac.soton.eventb.emf.proofassistant.SelectionHint
	 * @generated
	 */
	EClass getSelectionHint();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.emf.proofassistant.SelectionHint#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selections</em>'.
	 * @see ac.soton.eventb.emf.proofassistant.SelectionHint#getSelections()
	 * @see #getSelectionHint()
	 * @generated
	 */
	EReference getSelectionHint_Selections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProofassistantFactory getProofassistantFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.proofassistant.impl.ProofAssistantImpl <em>Proof Assistant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.proofassistant.impl.ProofAssistantImpl
		 * @see ac.soton.eventb.emf.proofassistant.impl.ProofassistantPackageImpl#getProofAssistant()
		 * @generated
		 */
		EClass PROOF_ASSISTANT = eINSTANCE.getProofAssistant();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROOF_ASSISTANT__COMPONENT = eINSTANCE.getProofAssistant_Component();

		/**
		 * The meta object literal for the '<em><b>Hints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROOF_ASSISTANT__HINTS = eINSTANCE.getProofAssistant_Hints();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.proofassistant.impl.HintImpl <em>Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.proofassistant.impl.HintImpl
		 * @see ac.soton.eventb.emf.proofassistant.impl.ProofassistantPackageImpl#getHint()
		 * @generated
		 */
		EClass HINT = eINSTANCE.getHint();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HINT__ELEMENT = eINSTANCE.getHint_Element();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.emf.proofassistant.impl.SelectionHintImpl <em>Selection Hint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.emf.proofassistant.impl.SelectionHintImpl
		 * @see ac.soton.eventb.emf.proofassistant.impl.ProofassistantPackageImpl#getSelectionHint()
		 * @generated
		 */
		EClass SELECTION_HINT = eINSTANCE.getSelectionHint();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION_HINT__SELECTIONS = eINSTANCE.getSelectionHint_Selections();

	}

} //ProofassistantPackage
