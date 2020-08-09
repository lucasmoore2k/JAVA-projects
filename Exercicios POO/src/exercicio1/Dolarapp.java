package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Dolarapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dolar dol = new Dolar();
		
		System.out.println("Qual o preço do dolar?");
		dol.price=sc.nextDouble();
		
		System.out.println("Quantos dolares vai comprar?");
		dol.quant=sc.nextDouble();
		System.out.printf("Valor a pagar em reais? %.2f",dol.amount());
	}


}
