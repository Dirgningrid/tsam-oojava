package fermo.ingrid.videoteca;

public class Dvd extends Film {
	public int preventivo(){
		if(super.getGiorni() == 2){
			return 3;
		} else if(super.getGiorni() == 1){
			return (int) 1.5;
		} else {
			return 3 + 2 * super.getGiorni();
		}
	}

}
