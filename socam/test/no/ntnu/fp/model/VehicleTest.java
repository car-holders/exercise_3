package no.ntnu.fp.model;

import java.util.ArrayList;

import junit.framework.TestCase;

public class VehicleTest extends TestCase {

	private Vehicle v;
	private ArrayList<Ecu> ecuList = new ArrayList<>();
	private Ecu ecu = new Ecu(0);
	private String id = "1";
	private String history = "blabla";
	private String series = "Ballsy";
	
	public VehicleTest() {
		ecuList.add(ecu);
		v = new Vehicle("1", "blabla", ecuList, "Ballsy");
	}
	
	public void testVehicleInit(){
		assertEquals(ecu, v.getEcu(0));
		assertEquals(id, v.getVehicleID());
		assertEquals(history, v.getHistoryLog());
		assertEquals(series, v.getSeries());
		assertEquals(1, v.getEcuCount());
	}

	public void testAddECU(){
		Ecu ecu2 = new Ecu(1);
		v.addEcu(ecu2);
		assertEquals(2, v.getEcuCount());
	}
	
	public void testRemoveECU(){
		v.removeEcu(ecu);
		assertEquals(0, v.getEcuCount());
	}
	
	public void testIndexOf(){
		assertEquals(0, v.indexOf(ecu));
	}
	
	

}
