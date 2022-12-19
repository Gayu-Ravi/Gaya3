package day8.arrayprograms;

import java.util.Scanner;

public class FindAndReplace {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + "th element ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the number that has to be replaced");
		int n = sc.nextInt();
		System.out.println("Enter the new number");
		int r = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (n == arr[i]) {
				arr[i] = r;
				break;
			}
		}

		System.out.println("Final array");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
