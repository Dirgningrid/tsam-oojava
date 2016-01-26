package fermo.ingrid.videoteca;

public class Cassetta extends Film {
	public int preventivo(){
		if(super.getGiorni() == 1){
			return 1;
		} else {
			return 1 + 2 * super.getGiorni();
		}
	}
}
