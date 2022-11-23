package loopStatements;
import java.util.Scanner;
public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check : ");
		int a, b,c, sum=0;
		a=sc.nextInt();
		c=a;
		while(a>0) {
				b=a%10;
				a=a/10;
				sum=sum+(b*b*b);
				}
		if(c==sum) {
			System.out.println("Given number is Amstrong Number");
		}
			else
				System.out.println("Given number is not Amstrong Number");
		}
		
		
}
