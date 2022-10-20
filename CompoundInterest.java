import java.util.Scanner;
public class CompoundInterest
{
    public static void main(String args[]) 
    {
        double p, r, t;
	int n;
        Scanner s = new Scanner(System.in);
	System.out.println("Enter Amount\t\t  :");
        System.out.print("Principal(Rs.)\t\t  : ");
        p = s.nextDouble();
        System.out.print("Rate of interest(%)\t  : ");
        r = s.nextDouble();
        System.out.print("Time period(yrs)\t  : ");
        t = s.nextDouble();
	System.out.print("Number of times compounded: ");
   	n = s.nextInt();
        double ci;
        ci = p * (Math.pow((1 + r/100), (t * n))) - p;
        System.out.print("Compound Interest(Rs.)\t  : " + ci);
    }
}