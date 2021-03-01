package devanshishah_sec402_ex02;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		// Object of Lotto class
		
		Lotto myGame = new Lotto();
		// taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number from 3 to 27: ");
		
		int inputValue = input.nextInt();
		
	//	The user runs the lotto up to 5 times and each time the sum of lotto numbers is calculated.
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			
			myGame.lotto();
			myGame.getMyArr();
			
			sum = 0;
			// calculating the sum of elements of an array
			for(int j = 0; j < myGame.getMyArr().length; j++)
			{
				sum = sum + myGame.getMyArr()[j];	
			}
			
			System.out.println(sum);
			if(sum == inputValue) {
				//user will win if the total number in random array match
				System.out.println("User wins");
				break;
				
			}
			
		}	
		//user will lose and computer will win if the total number in random array does not match in the five rolls
		if(sum != inputValue) {
			System.out.println("Computer wins");
		}
	}

}
