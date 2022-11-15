package loopStatements;
import java.util.Scanner;
public class MultiplicationTable 
{
	public static void main(String []args)
	{
	Scanner scan=new Scanner(System.in);
	int num, upto;
	System.out.print("Enter Number : ");
	num=scan.nextInt();
	System.out.print("Enter bottom : ");
	upto=scan.nextInt();
	int i=1;
	while(i<=upto)
		{
		System.out.println(i+"*"+num+"="+i*num);
		i++;
		}
	}

}
