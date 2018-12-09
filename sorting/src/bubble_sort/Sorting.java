package bubble_sort;

// Java program for implementation of Bubble Sort
public class Sorting
{
	private Integer arr[];
	
    public void bubbleSort(Integer[] data)
    {
        int n = data.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (data[j] > data[j+1])
                {
                    // swap temp and arr[i]
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
    }
 
    /* Prints the array */
   public  void printArray(Integer arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public Sorting(Integer[] arr) {
	
		this.arr = arr;
	}

	
		
	}

	
	

    // Driver method to test above
   /* public static void main(String args[])
    {
        sorting ob = new sorting();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}*/

