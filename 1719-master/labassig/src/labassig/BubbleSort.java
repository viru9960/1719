package labassig;

public class BubbleSort {

	private static int []data;
	
	public static int[] getData() {
		return data;
	}

	public static void setData(int[] data) {
		BubbleSort.data = data;
	}

	//public static void bsort(int []data)
	public static void bsort()
	{
		int size=data.length;
		
			//System.out.println("length="+size);
			
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<i;j++)
				{
					if(data[i]<data[j])
					{
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
					}
				}
			}
			
				
					
	}
	
	public static void print()
	{
		for(int i=0;i<data.length;i++)
		{
			System.out.println(""+data[i]);
		}
	}
	
}
