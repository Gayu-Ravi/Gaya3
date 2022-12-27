package day8.StringArray;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		System.out.println("Please enter starting position :");
		int startPos = sc.nextInt();
		int startIndex = startPos - 1;
		System.out.println("Please enter ending position : ");
		int endPos = sc.nextInt();
		int endIndex = endPos - 1;
		char[] subStringArr = seggregate(startIndex, endIndex, str);

		for (int i = 0; i < subStringArr.length; i++) {
			System.out.print(subStringArr[i]);
		}

	}

	public static char[] seggregate(int startIndex, int endIndex, String str) {
		char chArr[] = new char[endIndex - startIndex + 1];
		int chArrIndex = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i >= startIndex && i <= endIndex) {
				chArr[chArrIndex++] = str.charAt(i);
			}

		}
		return chArr;
	}

}
