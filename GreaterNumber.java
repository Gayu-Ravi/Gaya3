import java.util.Scanner;
public class GreaterNumber
{
	public static void main(String []args)
	{
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers  :");
		System.out.print("Num 1          :");
		a=sc.nextFloat();
		System.out.print("Num 2          :");
		b=sc.nextFloat();
		c=(a>b) ? a : b;
		System.out.println("Largest Number :"+ c);
	 }
}
	