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

import ac.soton.eventb.emf.proofassistant.Hint;
import ac.soton.eventb.emf.proofassistant.ProofAssistant;
import ac.soton.eventb.emf.proofassistant.ProofassistantPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;

import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proof Assistant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.proofassistant.impl.ProofAssistantImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.proofassistant.impl.ProofAssistantImpl#getHints <em>Hints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProofAssistantImpl extends EventBNamedCommentedElementImpl implements ProofAssistant {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EventBNamedCommentedComponentElement component;

	/**
	 * The cached value of the '{@link #getHints() <em>Hints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHints()
	 * @generated
	 * @ordered
	 */
	protected EList<Hint> hints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProofAssistantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProofassistantPackage.Literals.PROOF_ASSISTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBNamedCommentedComponentElement getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (EventBNamedCommentedComponentElement)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProofassistantPackage.PROOF_ASSISTANT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBNamedCommentedComponentElement basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(EventBNamedCommentedComponentElement newComponent) {
		EventBNamedCommentedComponentElement oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProofassistantPackage.PROOF_ASSISTANT__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hint> getHints() {
		if (hints == null) {
			hints = new EObjectContainmentEList<Hint>(Hint.class, this, ProofassistantPackage.PROOF_ASSISTANT__HINTS);
		}
		return hints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProofassistantPackage.PROOF_ASSISTANT__HINTS:
				return ((InternalEList<?>)getHints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProofassistantPackage.PROOF_ASSISTANT__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case ProofassistantPackage.PROOF_ASSISTANT__HINTS:
				return getHints();
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
			case ProofassistantPackage.PROOF_ASSISTANT__COMPONENT:
				setComponent((EventBNamedCommentedComponentElement)newValue);
				return;
			case ProofassistantPackage.PROOF_ASSISTANT__HINTS:
				getHints().clear();
				getHints().addAll((Collection<? extends Hint>)newValue);
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
			case ProofassistantPackage.PROOF_ASSISTANT__COMPONENT:
				setComponent((EventBNamedCommentedComponentElement)null);
				return;
			case ProofassistantPackage.PROOF_ASSISTANT__HINTS:
				getHints().clear();
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
			case ProofassistantPackage.PROOF_ASSISTANT__COMPONENT:
				return component != null;
			case ProofassistantPackage.PROOF_ASSISTANT__HINTS:
				return hints != null && !hints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProofAssistantImpl
