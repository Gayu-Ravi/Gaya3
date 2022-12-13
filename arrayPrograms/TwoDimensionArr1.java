package arrayPrograms;
import java.util.Scanner;
public class TwoDimensionArr1 {
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			int n,m;
			System.out.print("Enter reqd no. of rows    : ");
			n=sc.nextInt();
			System.out.print("Enter reqd no. of columns : ");
			m=sc.nextInt();
			int twoArr[][]=new int[n][m];
			System.out.println("Enter the elements of array : ");
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					twoArr[i][j]=sc.nextInt();
				}
			}
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					System.out.print(twoArr[i][j]+" ");
				}
					System.out.println();
		}
}}
