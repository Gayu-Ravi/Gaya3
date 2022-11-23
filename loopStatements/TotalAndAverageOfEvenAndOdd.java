package loopStatements;
import java.util.Scanner;

public class TotalAndAverageOfEvenAndOdd 
{
	public static void main(String []args)
	{
		int s,e,oddTotal, evenTotal,evenCounter=0,oddCounter=0 ; //Find the total and average of odd and even ofthe given range
		double oddAvg, evenAvg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting Range : ");
		s=sc.nextInt();
		System.out.println("Enter ending Range   : ");
		e=sc.nextInt();
		oddTotal=0; evenTotal=0;
		int i=s;
		for( i=s; i<=e; i++) {
			if(i%2!=0) {
				oddTotal=oddTotal+i;
				oddCounter++;
			}
			else {
				evenTotal=evenTotal+i;
				evenCounter++;
			}
		}
			evenAvg=(double)evenTotal/evenCounter;
			oddAvg=(double)oddTotal/oddCounter;
		System.out.println("Sum of odd numbers  : " + oddTotal);
		System.out.println("Sum of even numbers : " + evenTotal);
		System.out.println("Avg of even numbers : " + evenAvg);
		System.out.println("Avg of odd numbers  : " + oddAvg);
	}
}
