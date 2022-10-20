import java.util.Scanner;
public class SquareOfNumbers
{
	public static void main(String args[])
		{
		double base,power;
		power=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Base   : ");
		base=sc.nextDouble();
		System.out.print("Square : "+Math.pow(base,power));
		}
}
