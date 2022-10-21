import java.util.Scanner;
public class DurationCalculation
{
	public static void main(String args[])
	{
		float s,d,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Duration Calculation");
		System.out.print("Speed(km/hr)    : ");
		s=sc.nextFloat();
		System.out.print("Distance(km)    : ");
		d=sc.nextFloat();
		t=d/s;
		System.out.print("Duration(hr)    : "+t);
	}
}
		
		
	