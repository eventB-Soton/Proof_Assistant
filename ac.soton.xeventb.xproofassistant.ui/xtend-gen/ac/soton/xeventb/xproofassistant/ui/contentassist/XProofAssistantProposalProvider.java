/**
 * Copyright (c) 2019 University of Southampton.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 */
package ac.soton.xeventb.xproofassistant.ui.contentassist;

import ac.soton.xeventb.common.RodinSymbolsProposalProvider;
import ac.soton.xeventb.xproofassistant.ui.contentassist.AbstractXProofAssistantProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class XProofAssistantProposalProvider extends AbstractXProofAssistantProposalProvider {
  @Override
  public void complete_XFormula(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    RodinSymbolsProposalProvider.completeRodinSymbol(this, context, acceptor);
  }
}
