package day8.StringArray;

import java.util.Scanner;

public class TitleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String : ");
		String str = sc.nextLine();
		System.out.println("1.Title/2.Uppercase/3.Lowercase/4.SentenceCase :");
		System.out.println("Please enter the Operation(1/2/3/4) : ");
		int n = sc.nextInt();
		String outputString = "";
		char inputArr[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			inputArr[i] = str.charAt(i);
		}
		if (n == 1) {
			for (int i = 0; i < inputArr.length; i++) {
				if (i == 0 || inputArr[i - 1] == ' ') {
					if (inputArr[i] >= 97 && inputArr[i] <= 122) {
						inputArr[i] = (char) (inputArr[i] - 32);
					}
				}
			}
		} else if (n == 2) {
			for (int i = 0; i < inputArr.length; i++) {
				if (inputArr[i] >= 97 && inputArr[i] <= 122) {
					inputArr[i] = (char) (inputArr[i] - 32);
				}

			}
		} else if (n == 3) {
			for (int i = 0; i < inputArr.length; i++) {
				if (inputArr[i] >= 65 && inputArr[i] <= 90) {
					inputArr[i] = (char) (inputArr[i] + 32);
				}

			}
		} else if (n == 4) {
			for (int i = 0; i < inputArr.length; i++) {
				if (i == 0 || (i>=2 && inputArr[i - 2] == '.' && inputArr[i - 1] == ' ')) {
					if (inputArr[i] >= 97 && inputArr[i] <= 122) {
						inputArr[i] = (char) (inputArr[i] - 32);

					}
					//haste makes waste.look before you leap.
				}
			}
		} else {
			System.out.println("Enter valid input");
		}

		for (int i = 0; i < inputArr.length; i++) {
			outputString = outputString + inputArr[i];
		}
		System.out.println("Output : " + outputString);
		//welcome to java
		//boolean isNewWord=true
	}
}
