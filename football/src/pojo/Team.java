package pojo;

public class Team {
 
	 private String name;
	 private String gender;
	 private Integer total;
	 
	 public void play(){
		 System.out.println("play");;
		 
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	 
	
}
