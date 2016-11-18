package dataInputStream;

import java.util.Scanner;

public class EntradaComScanner {
	public static void main(String[] args) {
		String s = "";
		float nota1=0, nota2=0, trabalho=0, media=0;
		
		System.out.println("Entre com a nota 1");
		Scanner sc = new Scanner(System.in);
		nota1 = sc.nextFloat();
		
		System.out.println("Entra com a nota 2");
		sc = new Scanner(System.in);
		nota2 = sc.nextFloat();
		
		System.out.println("Entra com a nota do trabalho");
		sc = new Scanner(System.in);
		trabalho = sc.nextFloat();
		
		media = (nota1 + nota2 + trabalho) /3; 
		
		System.out.println("Media : " + media);
		
		
	}
}
