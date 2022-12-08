package arrayPrograms;

import java.util.Scanner;

public class SumOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + " element ");
			arr[i] = sc.nextInt();
		}
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + arr[i];
			} else {
				oddSum = oddSum + arr[i];
			}
		}

		System.out.println("Even sum: " + evenSum);
		System.out.println("Odd sum: " + oddSum);

	}
}
