import java.util.Scanner;

public class UnitConversion1

{
  public static void main(String []args)
  {
    int given, result, m;
    float a,b ;
    Scanner sc= new Scanner(System.in);
    System.out.println("****metre to km conversion***");
    System.out.print("Enter value(m) :");
    given=sc.nextInt();
    result=(given/1000);
    m=(given%1000);
    System.out.println("Result         :"+result+" km " +m+ "m");
    
    
    System.out.println("****kilometre to metre conversion***");
    System.out.print("Enter value(km) :");
    a=sc.nextFloat();
    b=(given*1000);
    System.out.println("Result          :"+b+" m");
  }
}
  