package day8.StringArray;

import java.util.Scanner;
//Reverse a sentence word by word 

public class SentenceReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the sentence : ");
		String str = sc.nextLine();
		char inputChArr[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			inputChArr[i] = str.charAt(i);
		}
		int temp = 0;
		for (int i = 0; i < inputChArr.length; i++) {
			if (inputChArr[i] == ' ') {
				int length = i - temp;
				for (int j = 0; j < length / 2; j++) {
					char tempCh = inputChArr[temp + j];
					inputChArr[temp + j] = inputChArr[i - 1 - j];
					inputChArr[i - 1 - j] = tempCh;

				}
				temp = i + 1;
			} else if ((i == inputChArr.length - 1)) {
				int length = i - temp;
				for (int j = 0; j < length / 2; j++) {
					char tempCh = inputChArr[temp + j];
					inputChArr[temp + j] = inputChArr[i - j];
					inputChArr[i - j] = tempCh;

				}
			}

		}

		System.out.println("Output: ");
		for (int i = 0; i < inputChArr.length; i++) {
			System.out.print(inputChArr[i]);
		}

	}
}