package array_list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> team=new ArrayList<>();
		
	team.add("ram");
	team.add("rohan");
	team.add("sahil");
	
//	System.out.println("player names are");
	for(String i :team)
	{
		System.out.println(""+i);
	}
		

		System.out.println("===========================");
		
		List<Student> students=new ArrayList<>();
		Student stu1=new Student("raj",1730);
		students.add(stu1);//this is a first type
		
		students.add(new Student("roy",1701));
		students.add(new Student("sameer",1702));
		students.add(new Student("gayatri",1703));
		
		for(Student j:students)
		{
			System.out.println(""+j.getRoll()+" "+j.getName());
			
		}
		
		System.out.println("================================");
		
		
		System.out.println("===================iterrator===========");
		
		
		Iterator<Student> myIterator=students.iterator();
		while(myIterator.hasNext())
		{
			Student stu;
			stu=myIterator.next();
			System.out.println(""+stu.getRoll()+" "+stu.getName());
		}
		
		
		
		
		
		
		
		
	}

	
	
}
