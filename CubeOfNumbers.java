import java.util.Scanner;
public class CubeOfNumbers
{
	public static void main(String args[])
		{
		double base,power;
		power=3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Base   : ");
		base=sc.nextDouble();
		System.out.print("Cube   : "+Math.pow(base,power));
		}
}
