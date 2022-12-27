package day8.StringArray;
//Find the first position of the given character in the given string. 

//Sample : 
// Enter your string : welcome 
// Enter character to find the position : e 
// Position of the character is : 1

import java.util.Scanner;

public class FirstPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		System.out.println("Please enter the character");
		char ch = sc.next().charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.println("Position: " + i);
				break;
			}
		}

	}

}
