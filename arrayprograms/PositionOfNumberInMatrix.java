package day8.arrayprograms;

import java.util.Scanner;

public class PositionOfNumberInMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col, n;
		System.out.print("Enter reqd no. of rows   : ");
		row = sc.nextInt();
		System.out.print("Enter reqd no. of columns: ");
		col = sc.nextInt();
		int twoArr[][] = new int[row][col];
		System.out.print("Enter the elements of Matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				twoArr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter number to find its position in the given matrix : ");
		n = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (twoArr[i][j] == n) {
					System.out.println("Position of given number :\nROW   :" + (i+1) +"\nCOLUMN:"+(j+1));

				}
			}
		}
	}
}
