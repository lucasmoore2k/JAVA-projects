package construtores;

public class Account {
	private int number;
	private String holder;
	private double poupanca;

	
	//Aplicando construtores para que possam se inicializar com parametros,pois a conta depende do deposito pois os parametros mudam
	
	public Account(int number, String holder, double poupanca) {
		super();
		this.number = number;
		this.holder = holder;
		this.poupanca = poupanca;
	}
	
	//Metodo com sobrecarga
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		;
	}
	
	
	
	//Aplicamos os getters e setters pois certos itens terão acesso e outros não
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getPoupanca() {
		return poupanca;
	}


	public void saca(double deposit) {
		this.poupanca-= deposit;
	}
	
	
	//Lógica de THIS
	
	public void depositar(double deposit) {
		this.poupanca+=deposit;
	}
	

	public String toString() {
		return "Account: "
				+number
				+", Holder: "
				+holder
				+", Balance: $ "
		        +poupanca;
	}
	
	
}
