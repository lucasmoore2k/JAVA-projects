package teste;

import java.util.Locale;
import java.util.Scanner;

public class Triangulosempoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1,x2,x3,y1,y2,y3;
		
		System.out.println("Enter measures of triangle x: ");
		x1=sc.nextDouble();
		x2=sc.nextDouble();
		x3=sc.nextDouble();
		System.out.println("Enter measures of triangle y: ");
		y1=sc.nextDouble();
		y2=sc.nextDouble();
		y3=sc.nextDouble();
		
		double x=(x1+x2+x3)/2.0;
		double py=(y1+y2+y3)/2.0;
		
		double areax = Math.sqrt(px*(px-x1)*(px-x2)*(px-x2));
		double areay = Math.sqrt(py*(py-y1)*(py-y2)*(py-y2));
		
		
		System.out.printf("Triangulo X:%.2f", areax);
		System.out.printf("%n Triangulo Y:%.2f", areay);
		
		if (areax>areay) {
			System.out.println("Larger area:X");
		}
		else {
			System.out.println("Larger area:y");
		}
		
		
		
		                  
		sc.close();
		
		
	
	
	}


}

