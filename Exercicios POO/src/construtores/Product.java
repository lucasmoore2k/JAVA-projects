package construtores;

public class Product {
	
	private String name;
	private double price;
	private int quant;

	
	//construtores
	
	public Product(String name,double price,int quant) {
		this.name=name;
		this.price=price;
		this.quant=quant;
	}

	//Sobrecarga é quando eu desejo criar um metodo com o mesmo nome
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}

	
	//Metodos de encapsulamento(get/set) servem para "esconder" de usúarios valores para que eles não alterem
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuant() {
		return quant;
	}

	public void setQuant(double quant) {
		this.price = quant;
	}

	
	public double Totalvalue() {
		return quant*price;
	}

	

	public void Addproducts(int quant) {
		this.quant+=quant;
		
	
	}
	
  public void Removeproducts(int quant) {
	  this.quant-=quant;
	}
	
  public String toString(){
	  return name+", $"+price+", "+quant+" units, Total: "+Totalvalue();
  };
	
}
