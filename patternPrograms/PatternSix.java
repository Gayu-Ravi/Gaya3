package patternPrograms;

import java.util.Scanner;

public class PatternSix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter required number of rows : ");
		int r = sc.nextInt();
		for (int row = 1; row <= r; row++) {
			for (int col = 0; col < r - row; col++) {
				System.out.print(" ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
