package pojo;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer rollno;
	private String name;
	private String surname;
	
	
	
	public Student() {
		super();
		this.rollno = 0;
		this.name = "virus";
		this.surname = "phoolwari";
	}
	
	
	public Student(Integer rollno, String name, String surname) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.surname = surname;
	}


	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	

}
	
    	


