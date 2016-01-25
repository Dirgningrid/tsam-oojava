package fermo.ingrid.commercialista;

public class Imprenditore extends Cliente {
	
	private int piva;
	private String ragioneSociale;
	private int fatture;
	
	public int parcellaCommercialista(){
		if(this.fatture <= 100){
			return 500;
		} else {
			return 500 + this.fatture - 100;
		}
	}

	public int getPiva() {
		return piva;
	}

	public void setPiva(int piva) {
		this.piva = piva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getFatture() {
		return fatture;
	}

	public void setFatture(int fatture) {
		this.fatture = fatture;
	}
	
	
}
