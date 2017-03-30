package no.ntnu.fp.model;


import junit.framework.TestCase;

public class SimpleEcuTest extends TestCase {

	private SimpleEcu se;
	private int ecuId = 321;
	private int swId = 123;
	
	public SimpleEcuTest() {
		se = new SimpleEcu(ecuId, swId);
	}
	
	
	public void testGetEcuId() {
		assertEquals(ecuId, se.getEcuId());
	}

	public void testSetEcuId() {
		se.setEcuId(0);
		assertEquals(0, se.getEcuId());
	}

	public void testGetSwId() {
		assertEquals(swId, se.getSwId());
	}

	public void testSetSwId() {
		se.setSwId(00);
		assertEquals(00, se.getSwId());
	}

}
