package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		//Fazer lista como a questão pede para armazenar os funinários
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employee: ");
		int n = sc.nextInt();
		
		for (int i =1 ; i<=n; i++) {
			System.out.println("Employee #"+i+"Data: ");
			System.out.print("Outsorced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours= sc.nextInt();
			System.out.print("Value per hour: ");
			Double valueperhour = sc.nextDouble();
			
			if (ch == 'y') {
			System.out.print("Adittional Charge: ");
			double additionalcharge= sc.nextDouble();
			Employee emp = new Outsourcedemployee(name, hours, valueperhour, additionalcharge);
			list.add(emp);
			
	
			}
			
			else {
				Employee emp = new Employee(name, hours, valueperhour);
				list.add(emp);
			}
			
			
			}
		

		System.out.println();
		System.out.println("Payments:");
		for (Employee emp: list) {
			System.out.println(emp.getName()+"- $" + String.format("%.2f", emp.payment()));
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
