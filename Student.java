package array_list;

public class Student {

	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	int roll;
	
	Student(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
}
