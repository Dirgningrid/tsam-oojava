public class Address {
	String tipoVia;
	String indirizzo;
	String numCivico;
	String citta;
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getNumCivico() {
		return numCivico;
	}
	public void setNumCivico(String numCivico) {
		this.numCivico = numCivico;
	}
	
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}	
	
	
	@Override
	public String toString(){
		return tipoVia + " " + indirizzo + ", " + numCivico + " " + citta;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Address)){
			return false;
		}
		Address a = (Address)o;
		return tipoVia.equals(a.tipoVia) 
				&& indirizzo.equals(a.indirizzo) 
				&& numCivico.equals(a.numCivico);
	}
	
	@Override
	public int hashCode(){
		return tipoVia.hashCode() + indirizzo.hashCode() + numCivico.hashCode();
	}
}


