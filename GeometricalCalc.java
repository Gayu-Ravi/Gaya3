import java.util.*;
class GeometricalCalc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of a square in cm");//To calc Area Of Square
		int side=sc.nextInt();
		System.out.println("Area of Square :"+side*side+"sq.cm");
		System.out.println("Enter length of rectangle in cm");//Area of rect
		int l=sc.nextInt();
		System.out.println("Enter breadth of rectangle in cm");
		int b=sc.nextInt();
		System.out.println("Area of rectangle :"+l*b+"sq.cm");
	}
}