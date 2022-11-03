import java.util.Scanner;

public class CentimetreConversion
{
	public static void main(String []args)
	{
		double given, km, m, ft, cms;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value:");
		given=sc.nextDouble();
		km=(int)(given/100000);
		m=(int)((given%100000)/100);
		ft=(int)((given%((given%100000)/100))/30);

		System.out.println("RESULT:"+km+"kms"+m+"m"+ft+"ft");
}}
		