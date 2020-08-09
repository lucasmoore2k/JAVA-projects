package construtores;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product("TV",50.00);//quando quero iniciar logo com valores e referenciar os PARAMETROS
		
		//Se eu desejasse referenciar os ATRIBUTOS deveria INSTANCIAR a classe somente depois de declarada as variaveis
		
		System.out.println("Coloque os dados do produto");
		
		
		System.out.printf("Name: ");
		prod.setName("computer");
		
		System.out.printf("Price: ");
		prod.setPrice(10);//Exemplo de acesso concedido
		
		System.out.printf("Quantity in stock: ");
		prod.getQuant();
		
		System.out.println("Product data:"+prod.toString());
		
		System.out.printf("Produtos a adcionar: ");
		int quant = sc.nextInt();
		prod.Addproducts(quant);
		
	
		System.out.println("Updated data:"+prod.toString());
		
		System.out.printf("Produtos a remover: ");
		quant=sc.nextInt();
		prod.Removeproducts(quant);
		
		System.out.println("Product data:"+prod.toString());
		
		
	}

}
