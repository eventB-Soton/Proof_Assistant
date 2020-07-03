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
package ac.soton.xeventb.xproofassistant;

import ac.soton.xeventb.common.EventBValueConverter;
import ac.soton.xeventb.xproofassistant.AbstractXProofAssistantRuntimeModule;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class XProofAssistantRuntimeModule extends AbstractXProofAssistantRuntimeModule {
  /**
   * Bind the value converter service for Event-B values, e.g., converting comments,
   * labels, etc.
   * 
   * @see EventBValueConverter
   */
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return EventBValueConverter.class;
  }
}
