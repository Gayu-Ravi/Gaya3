package loopStatements;
import java.util.Scanner;
public class TotalAndAverage 
{
	public static void main(String []args)
	{
		int s,e,total; //Find the total and average of the given range
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting Range : ");
		s=sc.nextInt();
		System.out.println("Enter ending Range   : ");
		e=sc.nextInt();
		total=0; avg=0;
		for(int i=s; i<=e; i++) {
			total=total+i;
			avg=total/((e-s)+1);
		}
		System.out.println("Total   : "+total);
		System.out.print("Average : "+avg);
		
		
		
		
		
	}

}
