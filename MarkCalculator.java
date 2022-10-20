import java.util.Scanner;
class MarkCalculator
{
	public static void main(String args[])
	{
	int eng,tam,mat,sci,soc,total;
	float avg,percentage;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks");
	System.out.print("English    : ");
	eng=sc.nextInt();
	System.out.print("Tamil\t   : ");
	tam=sc.nextInt();
	System.out.print("Maths\t   : ");
	mat=sc.nextInt(); 
	System.out.print("Science    : ");
	sci=sc.nextInt();
	System.out.print("Social     : ");
	soc=sc.nextInt();
	total=eng+tam+mat+sci+soc;
	avg=(float)total/5;
	percentage=((float)total/500)*100;
	System.out.println("Total\t   :"+total);
	System.out.println("Average    :"+avg);
	System.out.println("Percentage :"+percentage);
	}
}