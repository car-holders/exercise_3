package no.ntnu.fp.storage;

import junit.framework.TestCase;
import no.ntnu.fp.model.SimpleEcu;
import no.ntnu.fp.model.Software;

public class EcuDbStorageTest extends TestCase{
    public void testAddEcu(){
        SoftwareDbStorage sb = new SoftwareDbStorage();
        Software sw = new Software(6,1,"idk");
        sb.addSoftware( sw ,null);
        EcuDbStorage eds = new EcuDbStorage();
        SimpleEcu se = new SimpleEcu(6, 6);
        String[] message = eds.addEcu(se, null);
        assertEquals("Ecu added to database", message[0]);
    }
}
