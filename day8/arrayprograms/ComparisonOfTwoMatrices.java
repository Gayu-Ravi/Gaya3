package day8.arrayprograms;

import java.util.Scanner;

public class ComparisonOfTwoMatrices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row1, col1, row2, col2;
		System.out.print("Enter reqd no. of rows(Mat 1)   : ");
		row1 = sc.nextInt();
		System.out.print("Enter reqd no. of columns(Mat 1): ");
		col1 = sc.nextInt();
		System.out.print("Enter reqd no. of rows(Mat 2)   : ");
		row2 = sc.nextInt();
		System.out.print("Enter reqd no. of columns(Mat 2): ");
		col2 = sc.nextInt();
		int twoArr[][] = new int[row1][col1];
		if (row1 != row2 || col1 != col2) {
			System.out.println("RESULT : Either rows or columns in the given matrices are not equal.");
			return;
		}

		System.out.println("Enter the elements of Matrix 1  : ");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				twoArr[i][j] = sc.nextInt();
			}
		}

		int twoArr1[][] = new int[row2][col2];
		System.out.println("Enter the elements of Matrix 2  : ");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				twoArr1[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				if (twoArr[i][j] != twoArr1[i][j]) {
					System.out.println("RESULT : The given matrices are not equal.");
					return;
				}
			}

		}
		System.out.println("RESULT: The given two matrices are Equal");

	}
}
