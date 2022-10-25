public class TypeConversion
{
	public static void main(String []args)
	{
		System.out.println("Byte to Int Conversion"); //Type Conversion
		byte b=21;
		int a=b;
		System.out.println("Given value :" + b);
		System.out.println("Result      :" + a);

		System.out.println("Int to Byte Conversion"); //Type Casting
		int r=238;
		Byte p=(byte)r;
		System.out.println("Given value :" + r);
		System.out.println("Result      :" + p);
	}
}