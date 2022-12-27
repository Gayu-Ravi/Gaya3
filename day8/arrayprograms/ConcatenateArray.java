package day8.arrayprograms;
import java.util.Scanner;
public class ConcatenateArray {
	public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 1st array length:");
	int firstLength = sc.nextInt();
	int firstArr[] = new int[firstLength];
	for (int i = 0; i < firstArr.length; i++) {
		System.out.println("Enter the " + i + "th element ");
		firstArr[i] = sc.nextInt();
	}

	System.out.println("Enter the 2nd array length:");
	int secondLength = sc.nextInt();
	int secondArr[] = new int[secondLength];
	for (int i = 0; i < secondArr.length; i++) {
		System.out.println("Enter the " + i + "th element: ");
		secondArr[i] = sc.nextInt();
	}

	int totalLength = firstArr.length + secondArr.length;
	int conCatArr[] = new int[totalLength];

	for (int i = 0; i < conCatArr.length; i++) {
		if (i < firstArr.length) {
			conCatArr[i] = firstArr[i];
		} else {

			conCatArr[i] = secondArr[i - firstArr.length];
		}
	}

	System.out.println("First array:");

	for (int i = 0; i < firstArr.length; i++) {
		System.out.println(firstArr[i]);
	}

	System.out.println("Second array:");

	for (int i = 0; i < secondArr.length; i++) {
		System.out.println(secondArr[i]);
	}

	System.out.println("Concatenate array:");

	for (int i = 0; i < conCatArr.length; i++) {
		System.out.println(conCatArr[i]);
	}


}
}