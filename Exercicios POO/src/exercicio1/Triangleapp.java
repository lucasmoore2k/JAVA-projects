package exercicio1;


import java.util.Locale;
import java.util.Scanner;

public class Triangleapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangleclas x,y;
		x = new Triangleclas();
		y = new Triangleclas();
		
		
		System.out.println("Coloque as medidas de X: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		
		System.out.println("Coloque as medidas de y: ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
				
		System.out.printf("Area de x :%.2f ",x.area());
		System.out.printf("%n Area de y :%.2f ",y.area());
		
		if (x.area()>y.area()) {
			System.out.println("Maior triangulo:X");
		} else {
			System.out.println("Maior triangulo:Y");
		}
		
	
		
		sc.close();
		
	}
}
