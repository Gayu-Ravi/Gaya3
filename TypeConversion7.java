public class TypeConversion7
{
	public static void main(String args[])
	{	
		System.out.println("Char to String Conversion");
		char a='R';
		String b=Character.toString(a);
		System.out.println("Given value :" + a);
		System.out.println("Result      :" + b);
		
		System.out.println("String to Char Conversion");
		String g="RAVI";
		char d=g.charAt(0);
		System.out.println("Given value :" + g);
		System.out.println("Result      :" + d);
	}
}