package loopStatements;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String []args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to check whether it is prime or not:");
		n=sc.nextInt();
		i=1;
		while(i<n){
			
			if(n%2==0)
				System.out.print(n+ "is not a  prime number");
			else if(n%i==0)
				System.out.print(n+ "is not a prime number");
			else
				System.out.print(n+ "is a prime number" );
			i++; 
		}
		
	}

}
