package fermo.ingrid.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fermo.ingrid.commercialista.*;

public class ImprenditoreTest {

	@Test
	public void test() {
		Imprenditore i = new Imprenditore();
		i.setNome("Enrico");
		i.setCognome("Mattei");
		i.setPiva(123456789);
		i.setFatture(587);
		
		assertEquals(987, i.parcellaCommercialista());
		
	}

}
