import java.util.Scanner;

public class UnitConversion2

{
  public static void main(String []args)
  {
    int given, result, i; 
    float a, b ;
    Scanner sc= new Scanner(System.in);
    System.out.println("****inches to feet conversion***");
    System.out.print("Enter value(inch) :");
    given=sc.nextInt();
    result=(given/12);
    i=(given%12);
    System.out.println("Result            :"+result+" ft");
    System.out.println("****feet to inches conversion***");
    System.out.print("Enter value(ft) :");
    a=sc.nextFloat();
    b=(a*12);
    System.out.println("Result          :"+b+" inches");
  }
}