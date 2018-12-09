package factorial;

public class Factorial {
	
	static private int fact;
	
	
	
	public static int getFact() {
		return fact;
	}



	public static void setFact(int fact) {
		Factorial.fact = fact;
	}



	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static void print_factorial()
	{
		
		int result=1;
		
	
		
		for (int i = 1; i <= fact; i++)
		{
		    result = result * i;
		}
		
		System.out.println("FACTORIAL="+result);
	}
	
	

}
