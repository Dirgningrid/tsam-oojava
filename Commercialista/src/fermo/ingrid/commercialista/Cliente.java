package fermo.ingrid.commercialista;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String CF;
	
	private Dipendente[] dipendenti;
	private Imprenditore[] imprenditori;
	private LiberoProfessionista[] liberoProfessionisti;
	
	
	public int parcellaCommercialista() {
		int incasso = 0;
		for(Dipendente d: dipendenti){
			incasso += d.parcellaCommercialista();
		}
		for(Imprenditore i: imprenditori){
			incasso += i.parcellaCommercialista();
		}
		for(LiberoProfessionista lp: liberoProfessionisti){
			incasso += lp.parcellaCommercialista();
		}
		return incasso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}

	public Imprenditore[] getImprenditori() {
		return imprenditori;
	}

	public void setImprenditori(Imprenditore[] imprenditori) {
		this.imprenditori = imprenditori;
	}

	public LiberoProfessionista[] getLiberoProfessionisti() {
		return liberoProfessionisti;
	}

	public void setLiberoProfessionisti(LiberoProfessionista[] liberoProfessionisti) {
		this.liberoProfessionisti = liberoProfessionisti;
	}
	
	
	
}
