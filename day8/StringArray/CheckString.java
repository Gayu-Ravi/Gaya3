package day8.StringArray;

import java.util.Scanner;

//Check if the given string is found in the given sentence.
public class CheckString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence : ");
		String str = sc.nextLine();
		System.out.println("Please enter the word to be find : ");
		String word = sc.nextLine();
		char wordChArr[] = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			wordChArr[i] = word.charAt(i);
		}

		char inputChArr[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			inputChArr[i] = str.charAt(i);
		}
		int temp = 0;
		for (int i = 0; i < inputChArr.length; i++) {
			if (inputChArr[i] == ' ') {
				char subStringArr[] = SubString.seggregate(temp, i - 1, str);
				if (wordChArr.length == subStringArr.length) {
					boolean wordMatch = EqualString.compareTwoString(wordChArr, subStringArr);
					if (wordMatch) {
						System.out.println("The given word is in the sentence.");
						return;
					}
				}
				temp=i+1;
			}
		}
		System.out.println("The word is not in the sentence. ");

	}
}
