public class TypeConversion6
{
	public static void main(String args[])
	{	
		System.out.println("Int to Boolean Conversion");
		int a=1;
		boolean b=(a==1);
		System.out.println("Given value :" + a);
		System.out.println("Result      :" + b);
		
		System.out.println("Boolean to Int Conversion");
		boolean g=true;
		int d=(g) ? 1 : 0 ;
		System.out.println("Given value :" + g);
		System.out.println("Result      :" + d);
	}
}