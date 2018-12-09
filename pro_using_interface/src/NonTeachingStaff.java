
public class NonTeachingStaff extends Staff implements CalculateSalary {

	
	
	NonTeachingStaff(String Tname)
	{
		super(Tname);
		
		
	}
	

	public void calsal(int sal)
	 {
		super.sal=sal;
		System.out.println("Name="+name);
		 System.out.println("Teaching Staff salary"+sal);
	 }
	
	
}
