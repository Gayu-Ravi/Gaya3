package day8.StringArray;

import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		System.out.println("Please enter the character that has to be replaced : ");
		char findCh = sc.next().charAt(0);
		System.out.println("Please enter the character to insert : ");
		char replaceCh = sc.next().charAt(0);

		char chArr[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);
		}

		for (int i = 0; i < str.length(); i++) {
			if (chArr[i] == findCh) {
				chArr[i] = replaceCh;
			}
		}

		System.out.println(new String(chArr));

	}

}
