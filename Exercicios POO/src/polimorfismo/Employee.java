package polimorfismo;

public class Employee {
	
	private String name;
    private Integer hours;
    private Double valueperhour;

//Construtor padrão
     public Employee() {
    	 
     }


     
//Construtor com argumentos
     
     public Employee(String name, Integer hours, Double valueperhour) {
    		this.name = name;
    		this.hours = hours;
    		this.valueperhour = valueperhour;
    	}



	
   
//Metodos get and setters
    



	public String getName() {
 		return name;
 	}



 	public void setName(String name) {
 		this.name = name;
 	}



 	public Integer getHours() {
 		return hours;
 	}



 	public void setHours(Integer hours) {
 		this.hours = hours;
 	}



 	public Double getValueperhour() {
 		return valueperhour;
 	}



 	public void setValueperhour(Double valueperhour) {
 		this.valueperhour = valueperhour;
 	} 
      
     
//Funçao
 	
 	public double payment() {
 		return hours*valueperhour;
 	}
 	

}