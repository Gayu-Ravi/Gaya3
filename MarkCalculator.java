import java.util.Scanner;
class MarkCalculator
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter English mark: ");
	int Eng=sc.nextInt();
	System.out.print("Enter Tamil mark: ");
	int Tam=sc.nextInt();
	System.out.print("Enter Maths mark: ");
	int Mat=sc.nextInt();
	System.out.print("Enter Science mark: ");
	int Sci=sc.nextInt();
	System.out.print("Enter Social mark: ");
	int Soc=sc.nextInt();
	System.out.println("Total= "+(Eng+Tam+Mat+Sci+Soc));
	System.out.println("Average= "+((Eng+Tam+Mat+Sci+Soc)/5));
	System.out.println("Percentage= "+(Eng+Tam+Mat+Sci+Soc)/500*100);
	}
}