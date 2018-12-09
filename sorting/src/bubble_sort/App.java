package bubble_sort;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Integer[] data = {1,8,9,4,6,7,2,5,6};
	     
	  
	     
	     Sorting sor = new  Sorting(data);
	     
	     System.out.print("Array Befor Sorting : " );
	     sor.printArray(data);
	    	 
	     		sor.bubbleSort(data);

	     		
	     		System.out.print("Array After Sorting : " );	     		
	     		sor.printArray(data);
		
	}

}
