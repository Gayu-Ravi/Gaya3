package loopStatements;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=0, second=1, third=0, upto=0;
		System.out.println("Enter number to check Fibonacci Series : ");
		upto=sc.nextInt();
		System.out.println(first);
		for(int i=0; i<upto; i++) {	
			
		third=first+second;
		first=second; second=third;
		System.out.println(first);
		}
	}
}
