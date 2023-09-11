package finalexm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		// Generate 500 random # b/n 1 and 1000
		int[] randomNumbers = new int [500];
		Random random = new Random();
		for(int i = 0; i < 500; i++) {
			randomNumbers[i] = random.nextInt(1000) + 1;
		}
		
		Arrays.sort(randomNumbers);
		System.out.println("enter the value of N:");
		int n = scanner.nextInt();
		if ( n >= 1 && n <= 500) {
			int nthSmallest = randomNumbers[n-1];
			System.out.println("The" + n +  "th smallest number is:" + nthSmallest);
		} else {
			System.out.println("Invalid input. N should be between 1 and 500.");
		
		}
		
		scanner.close();
		
		

	}

}
