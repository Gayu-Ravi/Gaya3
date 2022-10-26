public class TypeConversion6
{
	public static void main(String args[])
	{	
		
		System.out.println("Int to Boolean Conversion");
		int a=1, r=234;
		boolean b=(a==1);
		boolean p=(r==234);
		System.out.println("Given value :" + a);
		System.out.println("Result      :" + b);
		System.out.println("Given value :" + r);
		System.out.println("Result      :" + p);
		
		System.out.println("Boolean to Int Conversion");
		boolean g=true;
		int d= (int) g ;
		boolean e=false;
		int f=(int) e;
		System.out.println("Given value :" + g);
		System.out.println("Result      :" + d);
		System.out.println("Given value :" + e);
		System.out.println("Result      :" + f);
	}
}
