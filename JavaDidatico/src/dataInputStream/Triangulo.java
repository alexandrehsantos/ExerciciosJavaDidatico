package dataInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangulo {
	public static void main(String[] args) {
		String s = "";
		float base=0,altura=0, area=0;
		BufferedReader entrada;
		
		try {
			System.out.println("Entre com a base");
			entrada = new BufferedReader(new InputStreamReader(System.in));
			s=entrada.readLine();
			base = Float.parseFloat(s);
			
			
			System.out.println("Entre com a altura");
			entrada = new BufferedReader(new InputStreamReader(System.in));
			s = entrada.readLine();
			altura = Float.parseFloat(s);
		} catch (NumberFormatException erro) {
			System.out.println("Erro ao converter a string em numero " + erro.toString());
		} catch (IOException erro) {
			System.out.println("Erro ao validar a entrada de dados " + erro.toString());
		}
		
		area = (base * altura )/ 2; 
		
		System.out.println("A area do tringulo é: " + area);
		
		
		
	}
}
