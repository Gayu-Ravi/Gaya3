package day8.arrayprograms;
import java.util.Scanner;
public class TransposeOfMatrix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int row, col;
		System.out.print("Enter reqd. number of rows   : ");
		row=sc.nextInt();
		System.out.print("Enter reqd. number of columns: ");
		col=sc.nextInt();
		int twoArr[][]=new int[row][col];
		int transArr[][]=new int[col][row];
		System.out.print("Enter matrix elements : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				twoArr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				transArr[j][i]=twoArr[i][j];
			}
		}
		System.out.println("Given Matrix : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(twoArr[i][j]+" ");
			}
				System.out.println();
	}
		System.out.println("Transpose Matrix : ");
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				System.out.print(transArr[i][j]+" ");
			}
				System.out.println();
	}

		
		
			
	}
}
