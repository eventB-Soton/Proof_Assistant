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

import ac.soton.eventb.emf.proofassistant.ProofassistantPackage;
import ac.soton.eventb.emf.proofassistant.SelectionHint;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eventb.emf.core.EventBElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Hint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.proofassistant.impl.SelectionHintImpl#getSelections <em>Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionHintImpl extends HintImpl implements SelectionHint {
	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<EventBElement> selections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionHintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProofassistantPackage.Literals.SELECTION_HINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventBElement> getSelections() {
		if (selections == null) {
			selections = new EObjectResolvingEList<EventBElement>(EventBElement.class, this, ProofassistantPackage.SELECTION_HINT__SELECTIONS);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProofassistantPackage.SELECTION_HINT__SELECTIONS:
				return getSelections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProofassistantPackage.SELECTION_HINT__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends EventBElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProofassistantPackage.SELECTION_HINT__SELECTIONS:
				getSelections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProofassistantPackage.SELECTION_HINT__SELECTIONS:
				return selections != null && !selections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SelectionHintImpl
