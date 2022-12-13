package arrayPrograms;
import java.util.Scanner;
public class MatrixAddn {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
					int row, col;
					System.out.print("Enter reqd no. of rows    : ");
					row=sc.nextInt();
					System.out.print("Enter reqd no. of columns : ");
					col=sc.nextInt();
					int twoArr[][]=new int[row][col];
					System.out.println("Enter the elements of Mat-1 : ");
					for(int i=0; i<row; i++) {
						for(int j=0; j<col; j++) {
							twoArr[i][j]=sc.nextInt();
						}
					}
					int twoArr1[][]=new int[row][col];
					System.out.println("Enter the elements of Mat-2 : ");
					for(int i=0; i<row; i++) {
						for(int j=0; j<col; j++) {
							twoArr1[i][j]=sc.nextInt();
						}
					}
					for(int i=0; i<row; i++) {
						for(int j=0; j<col; j++) {
							System.out.print(twoArr[i][j]+twoArr1[i][j]+ " ");
						}
					
					System.out.println();
					}
			
	}
}
