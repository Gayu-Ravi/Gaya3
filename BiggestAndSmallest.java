import java.util.Scanner;

public class BiggestAndSmallest
{
	public static void main(String []args)
	{
    		double a,b,c,d,e,largest,smallest;
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter numbers:");
    		System.out.print("Num 1         :");
    		a=sc.nextDouble();
    		System.out.print("Num 2         :");
    		b=sc.nextDouble();
    		System.out.print("Num 3         :");
    		c=sc.nextDouble();
    		d=(a>b) ? a : b;
   		largest=(c>d) ? c: d;
    		System.out.println("Largest Value :"+largest);
		e=(a<b) ? a : b;
		smallest=(c<e) ? c: e;
		System.out.println("Smallest Value:"+smallest);
	}
}
	

































































