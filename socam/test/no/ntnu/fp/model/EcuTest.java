package no.ntnu.fp.model;

import junit.framework.TestCase;

public class EcuTest extends TestCase {

	private Ecu ecu;
	private int ecuId = 10;
	private int swId = 9;
	private int subSwId = 23;
	private boolean newest = true;
	private int newestSub = 32;
	
	public EcuTest() {
		ecu = new Ecu(ecuId, swId, subSwId, newest, newestSub);
	}
	
	public void testGetId(){
		assertEquals(ecuId, ecu.getEcuId());
	}
	
	public void testSetId(){
		ecu.setEcuId(0);
		assertEquals(0, ecu.getEcuId());
	}
	
	public void testGetSwId(){
		assertEquals(9, ecu.getSwId());
	}
	
	public void testSetSwId(){
		ecu.setSwId(10);
		assertEquals(10, ecu.getSwId());
	}
	
	public void testGetSubSwId(){
		assertEquals(23, ecu.getSubSwId());
	}
	
	public void testSetSubSwId(){
		ecu.setSubSwId(0);
		assertEquals(0, ecu.getSubSwId());
	}
	
	public void testIsNewest(){
		assertTrue(ecu.isNewest());
	}
	
	public void testSetNewest(){
		ecu.setNewest(false);
		assertTrue(!ecu.isNewest());
	}
	
	public void testGetNewestSub(){
		assertEquals(32, ecu.getNewestSub());
	}
	
	public void testSetNewestSub(){
		ecu.setNewestSub(0);
		assertEquals(0, ecu.getNewestSub());
	}
}
