package no.ntnu.fp.model;

import java.util.ArrayList;
/**
 /* Created by sklirg, jie on 30/03/2017.
 */

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
	
	public void testGetEcus(){
		assertEquals(1, v.getEcus().size());
	}
	
	public void testSetEcus(){
		v.setEcus(null);
		assertEquals(null, v.getEcus());
		v.setEcus(ecuList);
		assertEquals(1, v.getEcus().size());
	}
	
	public void testGetLargestEcuId(){
		assertEquals(0, v.getLargestEcuId());
	}
	
	public void testSetVehicleDB(){
		v.setVehicleID("Bruh");
		assertEquals("Bruh", v.getVehicleID());
	}
	
	Vehicle vehicle = new Vehicle();

    /*
     * GBR2:
     * The GP shall be able to download information from the vehicle’s main computer
     * "information" is vaguely defined
     */
    public void testGetVehicleIdOnNewVehicle() {
        assertEquals("", this.vehicle.getVehicleID());
    }
    public void testGetVehicleIdOnNewConstructedVehicle() {
        Vehicle idVehicleTest = new Vehicle("testID", "", new ArrayList(), "");
        assertEquals("testID", idVehicleTest.getVehicleID());
    }

    public void testGetVehicleHistoryLogOnNewVehicle() {
        assertEquals("", this.vehicle.getHistoryLog());
    }

    public void testGetVehicleHistoryLogAfterChangingHistoryLog() {
        String initialHistoryLog = "created vehicle";
        String appendedHistoryLog = "updated vehicle";

        this.vehicle.setHistoryLog(initialHistoryLog);
        assertEquals(initialHistoryLog, this.vehicle.getHistoryLog());

        this.vehicle.setHistoryLog(appendedHistoryLog);
        assertEquals(appendedHistoryLog, this.vehicle.getHistoryLog());
    }

}
