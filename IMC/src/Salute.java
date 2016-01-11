
public class Salute {

	static void salute(Persona p) {
		double rischio = p.classeRischio();
		if(rischio >= 30)
			System.out.println("obeso");
		else if(rischio >= 25)
			System.out.println("sovrappeso");
		else if(rischio >= 18.5)
			System.out.println("normale");
		else 
			System.out.println("sottopeso");
	}

}
