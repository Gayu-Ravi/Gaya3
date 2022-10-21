import java.util.Scanner;
class DataType
{
	public static void main(String args[])
	{
		int phonenumber;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter PhoneNumber : ");
		phonenumber=s.nextInt();/*Exception in thread "main" 
					java.util.InputMismatchException: For input string: "8531800610"*/
	}
}
		