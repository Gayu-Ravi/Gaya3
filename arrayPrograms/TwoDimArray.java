package arrayPrograms;
import java.util.Scanner;
public class TwoDimArray {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter reqd no. of rows and columns: ");
		int n;
		n=sc.nextInt();
		int twoArr[][]=new int[n][n];
		System.out.println("Enter the elements of array : ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				twoArr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(twoArr[i][j]+" ");
			}
				System.out.println();
		}
	}
}
