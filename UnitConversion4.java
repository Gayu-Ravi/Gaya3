import java.util.Scanner;

public class UnitConversion4

{
  public static void main(String []args)
  {
    double given, result,a,b; 
    Scanner sc= new Scanner(System.in);
    System.out.println("****sq.ft to cent conversion***");
    System.out.print("Enter value(sq.ft) :");
    given=sc.nextDouble();
    result=(given*0.0023);

    System.out.println("Result              :"+result+" cent");
    System.out.println("****cents to sq.ft conversion***");
    System.out.print("Enter value(cents) :");
    a=sc.nextDouble();
    b=(a*435.56);
    System.out.println("Result             :"+b+" sq.ft");
  }
}