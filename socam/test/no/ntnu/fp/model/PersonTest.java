package no.ntnu.fp.model;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	private int custId = 0;
	private String name = "bob";
	private String email = "bob@bob.bob";
	private String street = "bobstreet";
	private String city = "bobtown";
	private String vehicleID = " booob";
	
	private Person p;

	public PersonTest() {
		p = new Person(custId, name, email, street, city, vehicleID);
	}
	
	public void testSetName(){
		assertEquals(name, p.getName());
		p.setName("Karl");
		assertEquals("Karl", p.getName());
	}

	public void testSetEmail(){
		assertEquals(email, p.getEmail());
		p.setEmail("Karl@karl");
		assertEquals("Karl@karl", p.getEmail());
	}
	
	public void testSetStreet(){
		assertEquals(street, p.getStreet());
		p.setStreet("karlstreet");
		assertEquals("karlstreet", p.getStreet());
	}
	
	public void testSetCity(){
		assertEquals(city, p.getCity());
		p.setCity("karls");
		assertEquals("karls", p.getCity());
	}
	
	public void testSetVehicleID(){
		assertEquals(vehicleID, p.getVehicleID());
		p.setVehicleID("asdasd223");
		assertEquals("asdasd223", p.getVehicleID());
	}
	
	public void testSetCustID(){
		assertEquals(custId, p.getCustId());
		p.setCustId(1);
		assertEquals(1, p.getCustId());
	}
}

