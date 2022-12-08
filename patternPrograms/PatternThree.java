package patternPrograms;

import java.util.Scanner;

public class PatternThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter required number of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter Increment Order 	      : ");
		int inc = sc.nextInt();
		for (int row = 1; row <= r; row++) {
			for (int col = 1; col <= row; col++) {
				int check = col > 1 ? (col * inc) - inc + 1 : col;
				System.out.print(check+" ");
			}
			System.out.println();
		}
	}
}
