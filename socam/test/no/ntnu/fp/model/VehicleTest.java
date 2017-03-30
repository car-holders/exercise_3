package no.ntnu.fp.model;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by sklirg on 30/03/2017.
 */
public class VehicleTest extends TestCase {
    Vehicle vehicle;
    public void setUp() {
        vehicle = new Vehicle();
    }
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
