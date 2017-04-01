package no.ntnu.fp.gui;

import junit.framework.TestCase;
import no.ntnu.fp.gui.FactoryProjectPanel;

public class RecallPanelITest extends TestCase {

	private FactoryProjectPanel fpPanel = new FactoryProjectPanel();
	private RecallPanel rp;
	
	public RecallPanelITest() {
		rp = new RecallPanel(fpPanel);
	}

	/*
	 * Untestable because it has no logic.
	 */
	public void testActionPerformed(){
		
	}
}
