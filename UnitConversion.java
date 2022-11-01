import java.util.Scanner;

public class UnitConversion

{
	public static void main(String []args)
 	{
    		int given, result, cm;
		float a,b ;
    		Scanner sc= new Scanner(System.in);
    		System.out.println("****centimetre to metre conversion***");
    		System.out.print("Enter value(cms) :");
    		given=sc.nextInt();
    		result=(given/100);
   		cm=(given%100);
    		System.out.println("Result           :"+result+" m " +cm+ "cm");
		
    		System.out.println("****metre to centimetre conversion***");
    		System.out.print("Enter value(m) :");
   		a=sc.nextFloat();
    		b=(given*100);
    		System.out.println("Result           :"+b+" cm");
  }
}