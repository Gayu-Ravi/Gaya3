package loopStatements;
import java.util.Scanner;

public class TotalAndAverageOfEvenAndOdd {
	public static void main(String []args)
	{
		int s,e,total1, total2; //Find the total and average of the given range
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting Range : ");
		s=sc.nextInt();
		System.out.println("Enter ending Range   : ");
		e=sc.nextInt();
		total1=0; total2=0; avg=0;
		for(int i=s; i<=e; i++) {
			if(i%2==0)
				total1=total1+i;
				
				
		}
		System.out.print("Sum of odd numbers : " + total1);
	}

}
