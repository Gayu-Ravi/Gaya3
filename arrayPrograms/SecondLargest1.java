package arrayPrograms;

import java.util.Scanner;

public class SecondLargest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int length = sc.nextInt();
		int sortArr[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Element " + i + " :");
			int value = sc.nextInt();
			sortArr[i] = value;
		}
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (sortArr[i] >sortArr[j]) {
					int temp = sortArr[i];
					sortArr[i] = sortArr[j];
					sortArr[j] = temp;
				}
			}
		}
			
		System.out.println("Second Largest Element : "+sortArr[length-2]);
		System.out.println("Third Smallest Element : "+sortArr[2]);
		
	}
}
