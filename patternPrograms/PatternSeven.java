package patternPrograms;

import java.util.Scanner;

public class PatternSeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter required number : ");
		int n = sc.nextInt();
		for (int row = 1; row < 2 * n; row++) {
			int check = row > n ? 2 * n - row : row;
			for (int col = 1; col <= check; col++) {
				System.out.print(col);
			}
			System.out.println();

		}
	}
}
