package polimorfismo;

public class Outsourcedemployee extends Employee {

	private Double additionalcharge;

	
	//Construtor padr�o
	
	public Outsourcedemployee() {
		super();
	}
	
	
	
	//Ao criar o m�todo puxamos os construtor do EMPLOYEE
	
	public Outsourcedemployee(String name, Integer hours, Double valueperhour, Double additionalcharge) {
		super(name, hours, valueperhour);//Super() serve para chamar o construtor da SUPERCLASSE
		this.additionalcharge = additionalcharge;
	}


	//Get and Set
	

	public Double getAdditionalcharge() {
		return additionalcharge;
	}



	public void setAdditionalcharge(Double additionalcharge) {
		this.additionalcharge = additionalcharge;
	}

	
	//Metodo sobreescrito porque ele � diferente do metodo da SUPERCLASSE
	
	@Override
	public double payment() {
 		return super.payment()+additionalcharge*1.1;
 	}
 	
	
	
	
	
}
