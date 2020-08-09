package metodosabstratos;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.print("Enter bnumber of shapes");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++) {
			System.out.println("Shape #"+i+"data:");
			System.out.println("Rectangule o circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Which color? ");
			Color color = Color.valueOf(sc.next());
			
			
			
	
		
			
			
		
		}
		
		
		
		
		
	}
	sc.close();
}
