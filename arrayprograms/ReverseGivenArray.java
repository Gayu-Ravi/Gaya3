package day8.arrayprograms;

import java.util.Scanner;

public class ReverseGivenArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter required no. of elements : ");
		int length = sc.nextInt();
		int originalArray[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Element " + i + " :");
			originalArray[i] =sc.nextInt();
		}
		int i=0, j=originalArray.length-1;
			while(i<j) {
				int temp=originalArray[i];
				originalArray[i]=originalArray[j];
				originalArray[j]=temp;
				i++; j--;
			
		}
		for(i=0; i<originalArray.length; i++) {
			System.out.println(originalArray[i]);
		}
				}
}
