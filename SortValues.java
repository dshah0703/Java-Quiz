package devanshishah_sec402_ex03;

public class SortValues {
	
	//static method–SortNumbers with variable number of arguments.
	public static int[] sortNumbers(int... numbers)
	{
		int[] arr = numbers;
		// Firstly it will show the original order of elements
		System.out.println("Elements in the original order:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		// to compare the elements in i and j we use for loop
		for (int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j< arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					// Swapping two elements.
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// returning the array.
		return arr;
			
	}
}
