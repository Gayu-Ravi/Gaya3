package loopStatements;
import java.util.Scanner;
public class FactorialOfGivenNumber 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number : ");
		long n,  result=1;
		n=s.nextInt();
		for(int i=1 ; i<=n; i++)
		{
			result=result*i;
		}
		System.out.print("Factorial of given number : " + result);	
	}
}
