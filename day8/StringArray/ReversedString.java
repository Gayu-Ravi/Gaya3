package day8.StringArray;

import java.util.Scanner;

public class ReversedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter required word : ");
		String given = sc.nextLine();
		char reverse[] = new char[given.length()];
		for (int i = 0; i < given.length(); i++) {
			reverse[i] = given.charAt(i);
		}
		doReverse(reverse);
		
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]);
		}
	}

	public static void doReverse(char[] reverse) {
		for (int i = 0; i < reverse.length / 2; i++) {
			char temp = reverse[i];
			reverse[i] = reverse[reverse.length - 1 - i];
			reverse[reverse.length - 1 - i] = temp;

		}		
	}
}
