package loopStatements;
import java.util.Scanner;
public class PrimeNumbersBetween1And100 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Prime Numbers Between 1 and 100 :");
		int n,i,factor;
		for(n=2; n<=100; n++) {
			factor=0;
			for(i=2; i<=100; i++) {
				if(n%i==0) {
					factor++;
				}
				
			}
			if(factor==1) {
				System.out.println(n);
			}
			
		}
	}

}
