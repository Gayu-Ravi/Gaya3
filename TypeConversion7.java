public class TypeConversion7
{
	public static void main(String args[])
	{	
		System.out.println("Char to String Conversion");// incompatible types: char cannot be converted to String
		char a='R';
		String b=(String) a;
		System.out.println("Given value :" + a);
		System.out.println("Result      :" + b);
		
		System.out.println("String to Char Conversion");// incompatible types: String cannot be converted to char
		String g="RAVI";
		char d=(char) g;
		System.out.println("Given value :" + g);
		System.out.println("Result      :" + d);
	}
}