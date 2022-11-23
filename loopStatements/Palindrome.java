package loopStatements;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		main("Gayathri");
	}
	public static void main(String args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b=0, c=0;
		System.out.println("Enter number to check : ");
		a=sc.nextInt();
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		if(a==c)
			System.out.println(a+" is a palindrome number");
		else
			System.out.println(a+" is not a palindrome number");
	}
}
