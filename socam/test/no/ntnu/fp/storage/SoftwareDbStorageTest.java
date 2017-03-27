package no.ntnu.fp.storage;

import junit.framework.TestCase;
import no.ntnu.fp.gui.FactoryProjectPanel;
import no.ntnu.fp.gui.SoftwarePanel;
import no.ntnu.fp.model.Software;

public class SoftwareDbStorageTest extends TestCase {
    public void testAddSoftware() {
        int softwareVersion = 8;
        SoftwareDbStorage sb = new SoftwareDbStorage();
        SoftwarePanel sp1 = new SoftwarePanel(new FactoryProjectPanel());
        Software sw1 = new Software(softwareVersion, 0, "idk");
        sp1.setModel(sw1);

        String message1 = sb.addSoftware(sw1, sp1);
        assertEquals("Software added", message1);

        SoftwarePanel sp2 = new SoftwarePanel(new FactoryProjectPanel());
        Software sw2 = new Software(softwareVersion, 1, "idk");
        sp2.setModel(sw2);
        String message2 = sb.addSoftware(sw2, sp2);
        assertEquals("Software id allready in db, added new sub id", message2);

    }

}