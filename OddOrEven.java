import java.util.Scanner;

public class OddOrEven
{
	public static void main(String []args)
	{
    		double given;
		String result;
    		Scanner sc=new Scanner(System.in);
    		System.out.print("Enter number:");
    		given=sc.nextDouble();
    		result=(given%2==0) ? "Even" :"Odd" ;
   		System.out.println("Result      :"+result);
		
	}
}
	