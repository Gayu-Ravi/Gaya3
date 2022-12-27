package day8.StringArray;
import java.util.Scanner;
public class PositionOfCharacter {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		char ch; int n; String str;
		System.out.println("Please enter the string		: ");
		str = sc.nextLine();
		System.out.println("Please enter the character	: ");
		ch = sc.next().charAt(0);
		System.out.println("Enter the starting position : ");
		n=sc.nextInt();
		for (int i=n+1; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.println("Position: " + i);
				return;
			}
		}
		System.out.println("No such element in the given string.");
	}
}
