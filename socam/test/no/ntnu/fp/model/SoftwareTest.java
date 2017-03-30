package no.ntnu.fp.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import junit.framework.TestCase;

public class SoftwareTest extends TestCase {
	
	private Software s;
	private int swVersion = 3;
	private int minorVersion = 1;
	private String url = "www.example.com";
	
	public SoftwareTest() {
		s = new Software(swVersion, minorVersion, url);
	}		
		
		
	public void testGetSwVersion() {
		assertEquals(swVersion, s.getSwVersion());
	}

	public void testSetSwVersion() {
		s.setSwVersion(45);
		assertEquals(45, s.getSwVersion());
	}

	public void testGetMinorVersion() {
		assertEquals(minorVersion, s.getMinorVersion());
	}

	public void testSetMinorVersion() {
		s.setMinorVersion(0000000);
		assertEquals(0000000, s.getMinorVersion());
	}

	public void testGetUrl() {
		assertTrue(s.getUrl() instanceof String );
	}

	public void testSetUrl() {
		s.setUrl("123124123.com");
		assertTrue(s.getUrl() instanceof String );
		assertEquals("123124123.com", s.getUrl());
	}
	

}
