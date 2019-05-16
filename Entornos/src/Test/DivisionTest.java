package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
	
	@Test
	public void testPos() {
		System.out.println("Divisi�n entornos");
		Division s = new Division (6,2);
		assertTrue(s.dividir() == 3);
	}
	@Test
	public void testNeg() {
		System.out.println("Divisi�n entornos");
		Division s = new Division (-6,-2);
		assertTrue(s.dividir() == 3);
	}
	@Test
	public void testPosNeg() {
		System.out.println("Divisi�n entornos");
		Division s = new Division (6,-2);
		assertTrue(s.dividir() == -3);
	}

}
