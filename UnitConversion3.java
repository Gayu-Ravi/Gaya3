import java.util.Scanner;

public class UnitConversion3

{
  public static void main(String []args)
  {
    int given, result, g; 
    float a, b ;
    Scanner sc= new Scanner(System.in);
    System.out.println("****Grams to kilograms conversion***");
    System.out.print("Enter value(g) :");
    given=sc.nextInt();
    result=(given/1000);
    g=(given%1000);
    System.out.println("Result         :"+result+" kg"+g+" gms");
    System.out.println("****kilograms to grams conversion***");
    System.out.print("Enter value(kg) :");
    a=sc.nextFloat();
    b=(a*1000);
    System.out.println("Result          :"+b+" gms");
  }
}