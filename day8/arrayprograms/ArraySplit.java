package day8.arrayprograms;

import java.util.Scanner;

public class ArraySplit {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter the " + i + "th element ");
			arr[i] = sc.nextInt();

		}

		int oddLength = 0;
		int evenLength = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] % 2 == 0) {
				evenLength++;
			} else if (!(arr[i] % 2 == 0)) {
				oddLength++;
			}
		}

		int oddArr[] = new int[oddLength];
		int evenArr[] = new int[evenLength];
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[evenCount++] = arr[i];
			} else {
				oddArr[oddCount++] = arr[i];
			}

		}

		System.out.println("Given array");

		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
		if (oddLength != 0) {
			System.out.println("Odd array");

			for (int i = 0; i < length; i++) {
				System.out.println(oddArr[i]);
			}
		}

		if (evenLength != 0) {
			System.out.println("Even array");

			for (int i = 0; i < length; i++) {
				System.out.println(evenArr[i]);
			}
		}

	}

}
