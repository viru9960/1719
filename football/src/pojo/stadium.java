package pojo;

public class stadium {
	
	private Integer capacity;
	private String condition;
	private String availability;;
	
	public void allowPlay(){
   
		System.out.println("allowPlay");
	}
    
	 public stadium(){
		 this.capacity = capacity;
		 this.condition = condition;
		 this.availability = availability;
		 
	 }
	
	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
}
