package day8.arrayprograms;
import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row1, col1, row2, col2;
		System.out.print("Enter reqd no. of rows(Mat 1)   : ");
		row1 = sc.nextInt();
		System.out.print("Enter reqd no. of columns(Mat 1): ");
		col1 = sc.nextInt();
		int arr[][] = new int[row1][col1];
		System.out.println("Enter the elements of Matrix 1  : ");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				arr[i][j] = sc.nextInt();
			}}
			System.out.print("Enter reqd no. of rows(Mat 2)   : ");
			row2 = sc.nextInt();
			System.out.print("Enter reqd no. of columns(Mat 2): ");
			col2 = sc.nextInt();
			int arr1[][] = new int[row2][col2];
			System.out.print("Enter the elements of Matrix 2  : ");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < col2; j++) {
					arr1[i][j] = sc.nextInt();
				}}
			if(col1==row2) {
				int resultArr[][] = new int[row1][col2];
				for(int i=0; i<row1; i++) {
				for(int j=0; j<col2; j++){
					resultArr[i][j]=0;
					
					for(int k=0; k <row1; k++)
					resultArr[i][j]=resultArr[i][j]+arr[i][k]*arr1[k][j];
					 
					 
						
					}
				}
				for(int i=0; i<resultArr.length; i++) {
					for(int j=0; j<resultArr[i].length; j++) {
						System.out.print(resultArr[i][j] +" ");
					}
				
				System.out.println();
				}
				}
			
			else {
				System.out.println("Multiplication of matrices cannot be performed");
			}
}}
