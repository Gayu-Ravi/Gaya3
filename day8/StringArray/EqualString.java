package day8.StringArray;

import java.util.Scanner;

public class EqualString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Word : ");
		String word1 = sc.nextLine();
		System.out.print("Enter Second Word : ");
		String word2 = sc.nextLine();
		char word1ChArr[] = new char[word1.length()];
		for (int i = 0; i < word1.length(); i++) {
			word1ChArr[i] = word1.charAt(i);
		}
		char word2ChArr[] = new char[word2.length()];
		for (int i = 0; i < word2.length(); i++) {
			word2ChArr[i] = word2.charAt(i);
		}


		boolean equal = compareTwoString(word1ChArr, word2ChArr);
		System.out.println(equal);
	}

	public static boolean compareTwoString(char[] word1ChArr, char[] word2ChArr) {
		if (word1ChArr.length == word2ChArr.length) {
			for (int i = 0; i < word1ChArr.length; i++) {
				if (word1ChArr[i] != word2ChArr[i]) {
					return false;
				}

			}
			return true;
		}
		return false;
	}

}
