package construtores;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		/*Account ac = new Account();
		 1-Manter essa instancia no inicio geraria erros pois os construtores pedem inicialização na CLASS account */
		
		Account ac;//Declaramos acima pois será necessário utilizar fora do escopo dos construtores
		
		double deposit;
		System.out.print("Enter account number: ");
		int number=sc.nextInt();//2-Com isso devo criar novas variaveis 
		System.out.print("Enter account holder: ");
		String holder=sc.next();
		System.out.print("Is the initial deposit(y/n)? ");
		char response = sc.next().charAt(0);
		if (response=='y') {
			System.out.print("Enter initial deposite value: ");
			deposit = sc.nextDouble();
			ac = new Account(number,holder, deposit);/*Ponto de inicio do construtor pois ao escolher iniciar 
			com deposito ele inicia o metodo com parametos definidos*/
		} 
		else {
		    ac = new Account(number,holder);/*Poderia colocar o 0 no lugar do deposito mas como isso poderia gerar algum erro,a boa prática 
		   é fazer um outro metodo sobrecarga*/ 
		}
		
		System.out.printf("Account Data: %n"+ac);
	
		System.out.println("Enter a deposit value:");
		deposit = sc.nextDouble();
		ac.depositar(deposit);   //Esse parametro objinstanciada.metodo(parametro) garante que o dado esta sendo armazendo no metodo
		
		System.out.printf("Updated Data: %n"+ac);
		
		System.out.println();
		
		
        System.out.println();
		
		System.out.println("Enter a withdraw value:");
		deposit = sc.nextDouble();
		ac.saca(deposit);
		
		System.out.printf("Updated Data: %n"+ac);
		
	
		
		
		
		
		
		sc.close();

		
	}
	
	
}
