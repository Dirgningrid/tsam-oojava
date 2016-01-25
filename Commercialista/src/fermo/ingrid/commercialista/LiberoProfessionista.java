package fermo.ingrid.commercialista;

public class LiberoProfessionista extends Cliente {
	
	private int piva;
	private int fatture;
	
	public int parcellaCommercialista(){
		int centesimi =  5000 + 50 * fatture;
		if(centesimi % 100 == 0){
			return centesimi / 100;
		} else {
			return Math.round(centesimi / 100);
		}
	}

	public int getPiva() {
		return piva;
	}

	public void setPiva(int piva) {
		this.piva = piva;
	}

	public int getFatture() {
		return fatture;
	}

	public void setFatture(int fatture) {
		this.fatture = fatture;
	}
	
	
}
