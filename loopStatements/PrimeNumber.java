package loopStatements;
import java.util.Scanner;
public class PrimeNumber 
	{
	public static void main(String[] args) 
		{
		int n, i, factor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check whether it is prime or not:");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) 
			{
			if (n % i == 0) 
				{
				factor++;
				}
			}
			if (factor == 2) 
				{
			System.out.println("The given number is Prime Number");
				} 
			else 
			{
			System.out.println("The given number is not primenumber");
			}
		}
	}
