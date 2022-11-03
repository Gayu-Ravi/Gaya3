import java.util.Scanner;
public class DenominationCalculation1
{
	public static void main(String[] args) 
	{
		int r2000,r500,r200,r100,r50,r10;
		Scanner scan = new Scanner(System.in);
		System.out.printf("%4s%2s","2000","=");
		r2000=scan.nextInt();
		System.out.printf("%4s%2s","500","=");
		r500=scan.nextInt();
		System.out.printf("%4s%2s","200","=");
		r200=scan.nextInt();
		System.out.printf("%4s%2s","100","=");
		r100=scan.nextInt();
		System.out.printf("%4s%2s","50","=");
		r50=scan.nextInt();
		System.out.printf("%4s%2s","10","=");
		r10=scan.nextInt();
		System.out.printf("%4s%2s%2d\n","2000","= ",r2000);
		System.out.printf("%4s%2s%2d\n","500","= ",r500);
		System.out.printf("%4s%2s%2d\n","200","= ",r200);
		System.out.printf("%4s%2s%2d\n","100","= ",r200);
		System.out.printf("%4s%2s%2d\n","50","= ",r50);
		System.out.printf("%4s%2s%2d\n","10","= ",r10);
		
		int amount =(2000*r2000)+(500*r500)+(200*r200)+(100*r100)+(50*r50);
		
		System.out.println("Total amount for above denominations : "+amount);

	}

}