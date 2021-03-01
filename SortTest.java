package devanshishah_sec402_ex03;

public class SortTest
{

	public static void main(String[] args) 
	{
		// The method "sortNumbers" should be called with numbers of parameters.
		
		int[] finalSort = SortValues.sortNumbers(10,18,15,100,-5,7);
		
		// It will display the numbers in descending order.
		
		System.out.println("\n Elements sorted in Descending order:");
		
		for(int i = 0; i < finalSort.length; i++)
		{
			System.out.print(finalSort[i] + " ");
		}

	}

}
