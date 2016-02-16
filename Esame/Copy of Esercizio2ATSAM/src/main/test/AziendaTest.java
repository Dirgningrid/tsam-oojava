package main.test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

import main.Dipendente;

public class AziendaTest {

	@Test
	public void test() {
		
		Set<Dipendente> sp = new HashSet<>();
		
		public int totaleStipendi() {
			Iterator<Dipendente> iter = sp.iterator();
			int stip = 0;
			while(iter.hasNext()) {
				Dipendente dip = iter.next();
				stip += Math.round(dip.calcolaStipendio());						
			}
			return stip;
		}
	}

}
