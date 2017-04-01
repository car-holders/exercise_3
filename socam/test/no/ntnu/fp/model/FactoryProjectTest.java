package no.ntnu.fp.model;

import java.util.ArrayList;

import junit.framework.TestCase;

public class FactoryProjectTest extends TestCase {

	private FactoryProject fp;
	
	public FactoryProjectTest() {
		fp = new FactoryProject();
	}

	public void testAddVehicle() {
		assertEquals(0, fp.getVehicleCount());
		fp.addVehicle(new Vehicle());
		assertEquals(1, fp.getVehicleCount());
	}
	public void testAddSoftware() {
		assertEquals(0, fp.getSoftwareCount());
		fp.addSoftware(new Software());
		assertEquals(1, fp.getSoftwareCount());
	}
	public void testAddEcu() {
		SimpleEcu e = new SimpleEcu(2);
		assertEquals(0, fp.getEcuCount());
		fp.addEcu(e);
		assertEquals(e, fp.getEcu(0));
		assertEquals(e, fp.getLatestEcu());
		assertEquals(1, fp.getEcuCount());
	}
	public void testRemoveVehicle() {
		fp.addVehicle(new Vehicle());
		fp.addVehicle(new Vehicle());
		assertEquals(2, fp.getVehicleCount());
		fp.removeVehicle(fp.getLatestVehicle());
		assertEquals(1, fp.getVehicleCount());
		fp.removeVehicle(fp.getVehicle(0));
		assertEquals(0, fp.getVehicleCount());
	}
	public void testGetSoftware() {
		Software s = new Software();
		
		fp.addSoftware(new Software());
		fp.addSoftware(s);
		assertEquals(s, fp.getLatestSoftware());
		assertEquals(1, fp.getSoftwareIndex(s));
		assertEquals(s, fp.getSoftware(1));
	}
	
	
	public void testGetVehicleIndex() {
		FactoryProject fv = new FactoryProject(new ArrayList<Vehicle>(), new ArrayList<Software>(), new ArrayList<SimpleEcu>());
		Vehicle v = new Vehicle();
		v.setVehicleID("asd");
		
		fv.addVehicle(v);
		
		assertEquals(0, fv.getVehicleIndex("asd"));
		
		assertEquals(-1, fv.getVehicleIndex("bob"));
	}
	
}
