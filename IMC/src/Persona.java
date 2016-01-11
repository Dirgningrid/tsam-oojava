
public class Persona {
	String nome;
	int età;
	
	double altezza;
	double peso;
	
	double classeRischio(){
		double classe = peso / (altezza * altezza);
		return classe;
	}
}
