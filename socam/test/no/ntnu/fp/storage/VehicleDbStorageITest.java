package no.ntnu.fp.storage;

import java.util.ArrayList;

import junit.framework.TestCase;
import no.ntnu.fp.gui.FactoryProjectPanel;
import no.ntnu.fp.gui.NewVehiclePanel;
import no.ntnu.fp.model.Ecu;
import no.ntnu.fp.model.Vehicle;

public class VehicleDbStorageITest extends TestCase {

	private VehicleDbStorage vehicledb;
	private Vehicle vehicle;
	private NewVehiclePanel nvp;
	private Ecu ecu;
	private ArrayList<String> messages;
	
	public VehicleDbStorageITest() throws Exception {
		setUp();
	}

	protected void setUp() throws Exception {
		//Set up vdb
		vehicledb = new VehicleDbStorage();
		
		//Set up Ecu
		ecu = new Ecu(57);
		
		//Set up v
		vehicle = new Vehicle();
		vehicle.addEcu(ecu);
		vehicle.setVehicleID("44");
		
		
		//Set up nvp
		nvp = new NewVehiclePanel(new FactoryProjectPanel());
		nvp.setModel(vehicle);
		
	}
	
	protected void tearDown() throws Exception{
		
	}

	public void testAddEcus(){
		messages = vehicledb.addEcus(vehicle, nvp);
		assertEquals("Vehicle updated", messages.get(0));
	}

	public void testGetVehicleNoVehiclesInDb() {
		Vehicle vehicle = vehicledb.getVehicle(200);
		assertEquals(null, vehicle);
	}

}
