
package no.ntnu.fp.storage;

import junit.framework.TestCase;
import no.ntnu.fp.gui.FactoryProjectPanel;
import no.ntnu.fp.gui.SoftwarePanel;
import no.ntnu.fp.model.Software;

public class SoftwareDbStorageITest extends TestCase {
    private SoftwareDbStorage sdbs;
    private Software sw;
    private SoftwarePanel swp;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        sdbs = new SoftwareDbStorage();
        sw = new Software();
        swp = new SoftwarePanel(new FactoryProjectPanel());
    }

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
/*
    public void testAddNewSoftware() {
        String r = null;
        try {
            r = sdbs.addSoftware(sw, swp);
        } catch (NullPointerException npe) {
            // Not testing updating UI components in this test.
        }
        // int subId = sw.getMinorVersion();

        // Adding software can respond with these four texts
        String[] lol = {
                "Software added",
                // "Software id allready in db and you entered a wrong sub id, it was changed to " +subId +" and added to db",
                "Software id allready in db, added new sub id",
                "SubId not 0, it was changed and added to db",
        };

        // assertNotNull(r);

        boolean matched = false;
        for (String expectedString : lol) {
            matched = expectedString.equals(r);
            if (matched) break;
        }

        // assertTrue(matched);
        assertTrue(true);
    }
*/
    public void testAddNewMinorVersion() {
        String r = null;
        try {
            r = sdbs.addSoftware(new Software(0, 1, ""), swp);
        } catch (NullPointerException npe) {
            // Not testing updating UI components in this test
        }

        assertEquals("SubId not 0, it was changed and added to db", r);
    }

    /*
     * GBR4 - GBR-T3
     * The GP shall be able to identify the latest version of each
     * software component for each ECU based on their version number
    */
    public void testGetLatestSoftwareVersion() {
        Software sw1 = new Software(100, 1, "");
        Software sw2 = new Software(100, 2, "");
        Software sw3 = new Software(100, 3, "");
        Software sw4 = new Software(100, 4, "");
        try {
            sdbs.addSoftware(sw1, swp);
            sdbs.addSoftware(sw2, swp);
            sdbs.addSoftware(sw3, swp);
            sdbs.addSoftware(sw4, swp);
        } catch (NullPointerException npe) {
            // Not testing updating UI components in this test
        }
        int id = sdbs.getBiggestSubId(sw4.getSwVersion());
        assertEquals(sw4.getMinorVersion(), id);
    }
}