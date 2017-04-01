package no.ntnu.fp.gui;

import junit.framework.TestCase;

public class RecallPanelITest extends TestCase {

	private FactoryProjectPanel fpPanel = new FactoryProjectPanel();
	private RecallPanel rp = new RecallPanel();
	
	public RecallPanelITest() {
		rp = new RecallPanel(fpPanel);
	}

	/*
	 * Untestable because it has no logic.
	 */
	public void testActionPerformed(){
		
	}
}
