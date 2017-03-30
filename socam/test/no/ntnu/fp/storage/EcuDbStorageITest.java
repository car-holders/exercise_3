package no.ntnu.fp.storage;

import junit.framework.TestCase;
import no.ntnu.fp.model.Ecu;
import no.ntnu.fp.model.SimpleEcu;

public class EcuDbStorageITest extends TestCase{
    int SOFTWARE_ID = 1;
    int ECU_ID = 0;
    /*
     * MSR 3
     * The CM team shall be able to enter an action script into a database
     *
     * MSR 5
     * The system shall be able to connect ECU to software components by action scripts
    */
    public void testAddEcu(){
        EcuDbStorage eds = new EcuDbStorage();
        SimpleEcu se = new SimpleEcu(6, 6);
        String[] message = eds.addEcu(se, null);
        assertEquals("Ecu added to database", message[0]);
    }

    /*
     * MSR 5
     * The system shall be able to connect ECU to software components by action scripts
    */
    public void testGetEcuSoft(){
        EcuDbStorage esd = new EcuDbStorage();

        SimpleEcu se = new SimpleEcu(89, 1);

        int [] ecuSoft = esd.getEcuSoft(new Ecu(89));
        assertEquals(89, ecuSoft[ECU_ID]);
        assertEquals(1, ecuSoft[SOFTWARE_ID]);
    }
}
