package day8.StringArray;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		char inputChArr[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			inputChArr[i] = str.charAt(i);
		}
		for (int i = 0; i < inputChArr.length; i++) {
			for (int j = i + 1; j < inputChArr.length; j++) {
				if (inputChArr[i] > inputChArr[j]) {
					char temp = inputChArr[i];
					inputChArr[i] = inputChArr[j];
					inputChArr[j] = temp;
				}
			}
		}
		for (int i = 0; i < inputChArr.length; i++) {
			System.out.print(inputChArr[i]);
		}

	}

}
