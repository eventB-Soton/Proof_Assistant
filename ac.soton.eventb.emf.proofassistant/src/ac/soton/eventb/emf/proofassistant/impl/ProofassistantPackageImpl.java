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

import ac.soton.eventb.emf.diagrams.DiagramsPackage;

import ac.soton.eventb.emf.proofassistant.Hint;
import ac.soton.eventb.emf.proofassistant.ProofAssistant;
import ac.soton.eventb.emf.proofassistant.ProofassistantFactory;
import ac.soton.eventb.emf.proofassistant.ProofassistantPackage;
import ac.soton.eventb.emf.proofassistant.SelectionHint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProofassistantPackageImpl extends EPackageImpl implements ProofassistantPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proofAssistantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionHintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.soton.eventb.emf.proofassistant.ProofassistantPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProofassistantPackageImpl() {
		super(eNS_URI, ProofassistantFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProofassistantPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProofassistantPackage init() {
		if (isInited) return (ProofassistantPackage)EPackage.Registry.INSTANCE.getEPackage(ProofassistantPackage.eNS_URI);

		// Obtain or create and register package
		ProofassistantPackageImpl theProofassistantPackage = (ProofassistantPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProofassistantPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProofassistantPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DiagramsPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProofassistantPackage.createPackageContents();

		// Initialize created meta-data
		theProofassistantPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProofassistantPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProofassistantPackage.eNS_URI, theProofassistantPackage);
		return theProofassistantPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProofAssistant() {
		return proofAssistantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProofAssistant_Component() {
		return (EReference)proofAssistantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProofAssistant_Hints() {
		return (EReference)proofAssistantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHint() {
		return hintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHint_Element() {
		return (EReference)hintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionHint() {
		return selectionHintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionHint_Selections() {
		return (EReference)selectionHintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProofassistantFactory getProofassistantFactory() {
		return (ProofassistantFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		proofAssistantEClass = createEClass(PROOF_ASSISTANT);
		createEReference(proofAssistantEClass, PROOF_ASSISTANT__COMPONENT);
		createEReference(proofAssistantEClass, PROOF_ASSISTANT__HINTS);

		hintEClass = createEClass(HINT);
		createEReference(hintEClass, HINT__ELEMENT);

		selectionHintEClass = createEClass(SELECTION_HINT);
		createEReference(selectionHintEClass, SELECTION_HINT__SELECTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		DiagramsPackage theDiagramsPackage = (DiagramsPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		proofAssistantEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		proofAssistantEClass.getESuperTypes().add(theDiagramsPackage.getDiagram());
		selectionHintEClass.getESuperTypes().add(this.getHint());

		// Initialize classes and features; add operations and parameters
		initEClass(proofAssistantEClass, ProofAssistant.class, "ProofAssistant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProofAssistant_Component(), theCorePackage.getEventBNamedCommentedComponentElement(), null, "component", null, 1, 1, ProofAssistant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProofAssistant_Hints(), this.getHint(), null, "hints", null, 1, -1, ProofAssistant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hintEClass, Hint.class, "Hint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHint_Element(), theCorePackage.getEventBElement(), null, "element", null, 1, 1, Hint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionHintEClass, SelectionHint.class, "SelectionHint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectionHint_Selections(), theCorePackage.getEventBElement(), null, "selections", null, 1, -1, SelectionHint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ProofassistantPackageImpl
