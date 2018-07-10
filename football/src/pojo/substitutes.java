package pojo;

public class substitutes {

	private String name;
	private String condition;
	private Integer age;
	private String playPosition;
	
	public void replace(){
		System.out.println("replace");
		;
	}
	
	public substitutes(){
		
		this.name = name;
		this.condition = condition;
		this.age = age;
		this.playPosition = playPosition;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPlayPosition() {
		return playPosition;
	}

	public void setPlayPosition(String playPosition) {
		this.playPosition = playPosition;
	}
	
}
