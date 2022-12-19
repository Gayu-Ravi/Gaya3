package day8.arrayprograms;

import java.util.Scanner;

public class ReverseOrderWithoutChangingPostion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Element " + i + " :");
			int value = sc.nextInt();
			arr[i] = value;
		}

		for (int i = length - 1; i >= 0; i--) {

			System.out.print(+arr[i]);
		}

	}

}
