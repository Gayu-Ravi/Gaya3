package day8.arrayprograms;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + "th element ");
			arr[i] = sc.nextInt();
		}

		// array sorting
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int arrDup[] = new int[length];
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arrDup[count++] = arr[i];// 1 1 2 3
			}
		}
		arrDup[count++] = arr[arr.length - 1];

		System.out.println("Final array");

		for (int i = 0; i < count; i++) {
			System.out.println(arrDup[i]);
		}

	}
}
