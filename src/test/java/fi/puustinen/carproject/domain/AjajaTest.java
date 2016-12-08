package fi.puustinen.carproject.domain;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fi.puustinen.carproject.domain.Ajaja.Ajotapa;

@RunWith(MockitoJUnitRunner.class)
public class AjajaTest {
	
	@Mock
	Auto mockAuto;
	
	@Before
	public void setUp() {
		when(mockAuto.laskeNopeus()).thenReturn(100.0);
		
	}
	@Test
	public void testAjaAgressiivinen() {
		Ajaja testattava = new Ajaja(mockAuto,"Spede Pasanen", Ajotapa.AGGRESSIIVINEN);
				
		assertEquals(0.01, testattava.aja(0.0001),0.00001);
		assertEquals(50, testattava.aja(0.5),0.0001);
		assertEquals(100, testattava.aja(1.0),0.0001);
		assertEquals(0, testattava.aja(-1.0),0.0001);
		assertEquals(10000000, testattava.aja(100000),0.1);
	}
	@Test
	public void testAjaTavallinen() {
		Ajaja testattava = new Ajaja(mockAuto,"Matti Meikäläinen", Ajotapa.TAVALLINEN);
				
		assertEquals(0.007, testattava.aja(0.0001),0.00001);
		assertEquals(35, testattava.aja(0.5),0.0001);
		assertEquals(70, testattava.aja(1.0),0.0001);
		assertEquals(0, testattava.aja(-1.0),0.0001);
		assertEquals(7000000, testattava.aja(100000),0.1);
	}
	@Test
	public void testAjaRauhallinen() {
		Ajaja testattava = new Ajaja(mockAuto,"Tero", Ajotapa.RAUHALLINEN);
				
		assertEquals(0.004, testattava.aja(0.0001),0.00001);
		assertEquals(20, testattava.aja(0.5),0.0001);
		assertEquals(40, testattava.aja(1.0),0.0001);
		assertEquals(0, testattava.aja(-1.0),0.0001);
		assertEquals(4000000, testattava.aja(100000),0.1);
	}

}