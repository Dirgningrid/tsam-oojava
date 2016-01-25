package fermo.ingrid.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fermo.ingrid.commercialista.LiberoProfessionista;

public class LiberoProfessionistaTest {

	@Test
	public void test() {
		LiberoProfessionista lp = new LiberoProfessionista();
		lp.setNome("Gigi");
		lp.setCognome("La Trottola");
		lp.setFatture(142);
		
		assertEquals(121, lp.parcellaCommercialista());
	
	}

}
