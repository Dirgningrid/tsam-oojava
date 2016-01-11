public class IMC {

	public static void main(String[] args) {
		
		Persona irma = new Persona();
			irma.peso = 56.0;
			irma.altezza = 1.63;
		Persona martino = new Persona();
			martino.peso = 59.0;
			martino.altezza = 1.65;
			
		double irmaRischio = irma.classeRischio();
		double martinoRischio = martino.classeRischio();
		
		
		System.out.println("l'Indice di Massa Corporeo di Ingrid è: " + irmaRischio);
		System.out.println("l'Indice di Massa Corporeo di Mario è: " + martinoRischio);
		
		
		
		System.out.println("e il suo stato di salute è: " + salute(Persona irma);
		
	}

}
