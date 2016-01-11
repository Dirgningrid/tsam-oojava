import java.util.Scanner;

public class CambiaMonete {

	public static void main(String[] args) {
		
		int quantità;
		int euro1, euro2, euro5, euro10, euro20, euro50, euro100, euro200, euro500;
		
		System.out.println("Digita la quantità di euro da cambiare:");
		
		Scanner tastiera = new Scanner(System.in);
		quantità = tastiera.nextInt();
		
		euro500 = quantità / 500;
		quantità %= 500;
		euro200 = quantità / 200;
		quantità %= 200;
		euro100 = quantità / 100;
		quantità %= 100;
		euro50 = quantità / 50;
		quantità %= 50;
		euro20 = quantità / 20;
		quantità %= 20;
		euro10 = quantità / 10;
		quantità %= 10;
		euro5 = quantità / 5;
		quantità %= 5;
		euro2 = quantità / 2;
		quantità %= 2;
		euro1 = quantità / 1;
		quantità %= 1;
		
		System.out.println("Il numero di monete 500 è " + euro500);		
		System.out.println("Il numero di monete 200 è " + euro200);		
		System.out.println("Il numero di monete 100 è " + euro100);		
		System.out.println("Il numero di monete 50 è " + euro50);		
		System.out.println("Il numero di monete 20 è " + euro20);		
		System.out.println("Il numero di monete 10 è " + euro10);		
		System.out.println("Il numero di monete 5 è " + euro5);		
		System.out.println("Il numero di monete 2 è " + euro2);		
		System.out.println("Il numero di monete 1 è " + euro1);		

	}

}
