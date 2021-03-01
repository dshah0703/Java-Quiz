package devanshishah_sec402_ex02;

import java.security.SecureRandom;

public class Lotto {
	// creating an array instance variable that can 
	//hold upto three random integer values
	
	public int myArr[] = new int[3];
	//a constructor that randomly populates
	//the array for a lotto object.
	public void lotto()
	{
		for(int counter = 0; counter < myArr.length; counter++)
		{
			//this will produce random numbers
			SecureRandom randomNumbers = new SecureRandom();
			//the random numbers will assign values from 1 to 9
			int arrayValue = 1 + randomNumbers.nextInt(9);
			
			myArr[counter] = arrayValue;
		}
	}
	// for returning an array
	public int[] getMyArr()
	{
		return myArr;
	}
	
}



