package main;

/**
 * Classe rappresentante un Dipendente.
 * L'univocità di un dipendente è data dal suo CF.
 *
 */
public abstract class Dipendente implements Stipendi{
	
	private String cf;
	private int anzianita;
	private int pagaBase;
	
	public abstract double calcolaStipendio();

	/**
	 * Il codice fiscale identifica univocamente un Dipendente
	 * @return CF
	 */
	public String getCF() {
		return cf;
	}

	/**
	 * Il codice fiscale identifica univocamente un Dipendente
	 * @param cf codice fiscale
	 */
	public void setCF(String cf) {
		this.cf = cf;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public int getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(int pagaBase) {
		this.pagaBase = pagaBase;
	}
	//necessario per il Set
	
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof Dipendente))
			return false;
		
		Dipendente d = (Dipendente)o;
		
		if (this.getCF() == null)
			return d.getCF() == null;
					
		return this.getCF().equals(d.getCF());
	}
	
	// necessario per hash set
	@Override
	public int hashCode() {
		return getCF().hashCode();
	}
	
	
}
