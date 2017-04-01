package no.ntnu.fp.model;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

	private Project p;
	private Person pe = new Person(1);
	
	public ProjectTest() {
		p = new Project();
		p.addPerson(pe);
	}
	
	public void testGetPerson(){
		assertEquals(pe, p.getPerson(0));
	}
	
	public void testPersonCount(){
		assertEquals(1, p.getPersonCount());
	}
	
	public void testGetLargestCustId(){
		assertEquals(pe.getCustId(), p.getLargestCustId());
		p.removePerson(pe);
		assertEquals(0, p.getLargestCustId());
	}
	
	public void testGetPersonIndexName(){
		assertEquals((Integer) 0,(Integer) p.getPersonIndex("").get(0));
	}
	
	public void testIndexOf(){
		assertEquals(0, p.indexOf(pe));
	}
	
	public void testContainsPerson(){
		assertTrue(p.contains(pe));
	}
	
	public void testGetPersonIndexVehicle(){
		pe.setVehicleID("0");
		assertEquals((Integer) 0, (Integer) p.getPersonIndex(0));
	}
	
	public void testRemovePerson(){
		p.removePerson(pe);
		assertEquals(0, p.getPersonCount());
	}

}
