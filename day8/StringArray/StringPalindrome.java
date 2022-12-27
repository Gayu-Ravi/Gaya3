package day8.StringArray;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String inputStr=sc.nextLine();
		char inputChArr[] = new char[inputStr.length()];
		char reverseChArr[] = new char[inputStr.length()];
		for (int i = 0; i < inputStr.length(); i++) {
			inputChArr[i] = inputStr.charAt(i);
			reverseChArr[i] = inputStr.charAt(i);
		}
		ReversedString.doReverse(reverseChArr);
		boolean isEqual=EqualString.compareTwoString(inputChArr, reverseChArr);
		if(isEqual) {
			System.out.println("The given string is palindrome.");
		}
		else {
			System.out.println("The given string is not palidrome.");
		}
	}

}
