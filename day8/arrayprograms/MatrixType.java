package day8.arrayprograms;

import java.util.Scanner;

public class MatrixType {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.print("Enter reqd no. of rows    : ");
		row = sc.nextInt();
		System.out.print("Enter reqd no. of columns : ");
		col = sc.nextInt();
		if(row!=col) {
			System.out.println("Invalid :-Rows and columns are not equal");
			return;
		}
		int arr[][] = new int[row][col];
		System.out.println("Enter the elements of array : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		condition: {
			// To check identity matrix
			identity: {
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if (i == j && arr[i][j] != 1) {
							break identity;
						}
						if (i != j && arr[i][j] != 0) {
							break condition;
						}
					}
				}
				System.out.println("Given matrix is Identity Matrix");
				return;
			}

			// To check scalar matrix
			scalar: {
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if (i != j && arr[i][j] != 0) {
							break condition;
						}

						if (i != 0 && j != 0 && i == j && arr[i][j] != arr[i - 1][j - 1]) {
							break scalar;
						}
					}
				}
				System.out.println("Given matrix is Scalar Matrix");
				return;

			}
			// To check diagonal matrix
			diagonal: 
			{
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						if (i != j && arr[i][j] != 0) {
							break condition;
						}

					}
				}
				System.out.println("Given matrix is Diagonal Matrix");
				return;
			}
		}
			System.out.println("Give valid input.");

		

	}
}
