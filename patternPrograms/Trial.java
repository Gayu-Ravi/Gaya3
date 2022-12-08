package patternPrograms;

import java.util.Scanner;

public class Trial {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter required number of rows : ");
		int r=sc.nextInt();
		for(int row=1; row<=r; row++) {
			for(int col=r; col>=row; col--) {
				System.out.print(col);
				}
			System.out.println();
		}
	}

}



