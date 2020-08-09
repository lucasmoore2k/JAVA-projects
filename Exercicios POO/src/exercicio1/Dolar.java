package exercicio1;

public class Dolar {
	
	public double price;
	public double quant;
	
	
	public double amount() {
		return (quant*price)*((6.0/100.0)+1);
	}
	

}
