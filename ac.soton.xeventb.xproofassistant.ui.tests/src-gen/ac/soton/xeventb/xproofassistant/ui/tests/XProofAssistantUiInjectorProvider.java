/*
 * generated by Xtext 2.16.0
 */
package ac.soton.xeventb.xproofassistant.ui.tests;

import ac.soton.xeventb.xproofassistant.ui.internal.XproofassistantActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class XProofAssistantUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XproofassistantActivator.getInstance().getInjector("ac.soton.xeventb.xproofassistant.XProofAssistant");
	}

}