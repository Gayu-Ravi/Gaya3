package patternPrograms;

import java.util.Scanner;

public class PatternOne {
	public static void main(String args[]) {
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter required number of rows : ");
		r = scan.nextInt();
		for (int i = 1; i <= r; i++) // outer loop: row
		{
			for (int j = 1; j <= i; j++) // inner loop: column
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
