package patternPrograms;

import java.util.Scanner;

public class PatternFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter reqd. number of rows : ");
		int r = sc.nextInt();
		for (int row = 1; row <= r; row++) {
			for (int col = r - 1; col >= row; col--) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
