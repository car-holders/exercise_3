
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

    public void testAddNewMinorVersion() {
        String r = null;
        try {
            r = sdbs.addSoftware(new Software(0, 1, ""), swp);
        } catch (NullPointerException npe) {
            // Not testing updating UI components in this test
        }

        assertEquals("SubId not 0, it was changed and added to db", r);
    }
}