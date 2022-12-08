package patternPrograms;
import java.util.Scanner;
public class PatternTwo {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter required number of rows : ");
		int r=sc.nextInt();
		for(int row=1; row<=r; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print(col);
				}
			System.out.println();
		}
	}

}
