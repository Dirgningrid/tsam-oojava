
public class Persona {
	String nome;
	int et�;
	
	double altezza;
	double peso;
	
	double classeRischio(){
		double classe = peso / (altezza * altezza);
		return classe;
	}
}
