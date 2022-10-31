import java.util.Scanner;

public class VoteEligibility
{
	public static void main(String []args)
	{
		int age; 
		String name, gender, eligibility;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the below details:");
		System.out.print("Name        :" );
		name=sc.nextLine();
		System.out.print("Gender      :" );
		gender=sc.nextLine();
		System.out.print("Age         :" );
		age=sc.nextInt();
		eligibility= (age>=18) ? "Eligible for Vote" : "Ineligible for vote";
		System.out.println("Eligibility :"+eligibility);
	}
}
