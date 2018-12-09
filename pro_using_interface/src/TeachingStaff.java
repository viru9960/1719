
public class TeachingStaff extends Staff implements CalculateSalary{
	
	
	TeachingStaff(String Tname)
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
