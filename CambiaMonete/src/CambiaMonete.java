import java.util.Scanner;

public class CambiaMonete {

	public static void main(String[] args) {
		
		int quantit�;
		int euro1, euro2, euro5, euro10, euro20, euro50, euro100, euro200, euro500;
		
		System.out.println("Digita la quantit� di euro da cambiare:");
		
		Scanner tastiera = new Scanner(System.in);
		quantit� = tastiera.nextInt();
		
		euro500 = quantit� / 500;
		quantit� %= 500;
		euro200 = quantit� / 200;
		quantit� %= 200;
		euro100 = quantit� / 100;
		quantit� %= 100;
		euro50 = quantit� / 50;
		quantit� %= 50;
		euro20 = quantit� / 20;
		quantit� %= 20;
		euro10 = quantit� / 10;
		quantit� %= 10;
		euro5 = quantit� / 5;
		quantit� %= 5;
		euro2 = quantit� / 2;
		quantit� %= 2;
		euro1 = quantit� / 1;
		quantit� %= 1;
		
		System.out.println("Il numero di monete 500 � " + euro500);		
		System.out.println("Il numero di monete 200 � " + euro200);		
		System.out.println("Il numero di monete 100 � " + euro100);		
		System.out.println("Il numero di monete 50 � " + euro50);		
		System.out.println("Il numero di monete 20 � " + euro20);		
		System.out.println("Il numero di monete 10 � " + euro10);		
		System.out.println("Il numero di monete 5 � " + euro5);		
		System.out.println("Il numero di monete 2 � " + euro2);		
		System.out.println("Il numero di monete 1 � " + euro1);		

	}

}
