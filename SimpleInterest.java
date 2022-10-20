import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[]) 
    {
        float p, r, n;
        Scanner s = new Scanner(System.in);
	System.out.println("Enter Amount\t\t:");
        System.out.print("Principal(Rs.)\t\t: ");
        p = s.nextFloat();
        System.out.print("Rate of interest(%)\t: ");
        r = s.nextFloat();
        System.out.print("Time period(yrs)\t: ");
        n = s.nextFloat();
        float si;
        si = (p*n*r) / 100;
        System.out.print("The Simple Interest is  : " + si);
    }
}
