package loopStatements;

import java.util.Scanner;

public class OddNumber 
{
	public static void main(String[] args) 
	{
		int s, e, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting range :");
		s = sc.nextInt();
		System.out.println("Enter ending range   :");
		e = sc.nextInt();

		for (i = s; i <= e; i++)
		{
			if (i % 2 != 0)
				System.out.println(i);

		}
	}

}
