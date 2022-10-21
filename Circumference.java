import java.util.Scanner;
class Circumference
{
	public static void main(String args[])
	{
	double cir,rect,squ,pi,r,l,b,a,circum;
	pi=3.14;
	Scanner sc = new Scanner(System.in);
	System.out.println("***** Circumference Calculation *****");
	System.out.println("CIRCLE:");
	System.out.print("Enter radius:");
	r=sc.nextDouble();
	System.out.println("Circumference: "+2*pi*r);
	System.out.println("RECTANGLE:");
	System.out.print("Enter length:");
	l=sc.nextDouble();
	System.out.print("Enter breadth:");
	b=sc.nextDouble();
	System.out.println("Circumference :"+2*(l+b));
	System.out.println("SQUARE:");
	System.out.print("Enter side:");
	a=sc.nextDouble();
	System.out.println("Circumference: "+4*a);
	}
}	
		