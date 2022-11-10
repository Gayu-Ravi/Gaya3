package conditionalStructures;
import java.util.Scanner;
public class IfPrograms
{
	public static void bigger()
	{
		double a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("BIGGEST OF TWO ");
		System.out.print("Number 1       : ");
		a=sc.nextDouble();
		System.out.print("Number 2       : ");
		b=sc.nextDouble();
		if(a>b)
			System.out.print("Largest Number : " +a);
		else
			System.out.println("Largest Number : " +b);
	}
	public static void biggest()
	{
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nBIGGEST OF THREE ");
		System.out.print("Number 1       : ");
		a=sc.nextDouble();
		System.out.print("Number 2       : ");
		b=sc.nextDouble();
		System.out.print("Number 3       : ");
		c=sc.nextDouble();
		if(a>b && a>c)
			System.out.print("Largest Number : " +a);
		else if(b>c)
			System.out.print("Largest Number : " +b);
		else
			System.out.print("Largest Number : " +c);
		if(a<b && a<c)
			System.out.print("\nSmallest Number: " +a);
		else if(b<c)
			System.out.print("\nSmallest Number: " +b);
		else 
			System.out.print("\nSmallest Number: " +c);
	}
	public static void oddeven()
	{
		double a;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\nODD OR EVEN  ");
		System.out.print("Enter Number  : ");
		a=sc.nextDouble();
		if(a%2== 0)
			System.out.println("The given number is Even");
		else
			System.out.println("The given number is odd");	
	}
	public static void alphabetcase()
	{
		char g  ;
		Scanner sc=new Scanner(System.in);
		System.out.print("\n\nEnter Letter : ");
		g=sc.nextLine().charAt(0);
		if (g>=65 && g<=90)
			System.out.print("The given alphabet is in UPPERCASE");
		else if (g>=97 && g<=122)
			System.out.print("The given alphabet is in LOWERCASE");
		else 
			System.out.print("The given character is not an alphabet");
	}
	public static void vote()
	{
		int age;
		String name;
		char gender; 
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n***Vote Eligibility***");
		System.out.print("Enter Name    : ");
		name=sc.nextLine();
		System.out.print("Gender(M/F)   : ");
		gender=sc.next().charAt(0);
		System.out.print("Age           : ");
		age=sc.nextInt();
		if(gender=='M' && age>=18)
			System.out.println("Mr."+name+ "is Eligible to vote");
		else if(gender=='F' && age>=18)
			System.out.println("Ms/Mrs." +name+ " is Eligible to vote");	
		else
			System.out.println("This person is not eligible for vote");
		}
	public static void pass()
	{
		int eng,tam,mat,sci,soc,total;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n***Grade Calculator***");
		System.out.println("Enter Marks :");
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
		System.out.println("Total      : " +total);
		if (eng>=35 && tam>=35 && mat>=35 && sci>=35 && soc>=35)
			System.out.print("RESULT     : This Student is PROMOTED to the next grade");
		else
			System.out.print("RESULT     : This Student is DETAINED in the same grade");
	}
	public static void cutoff()
	{
		int phy,che,mat,bio;
		double mbbs,be;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n\n***Cutoff Calculator***    ");
		System.out.println("Enter Marks   : ");
		System.out.print("PHYSICS       : ");
		phy=sc.nextInt();
		System.out.print("CHEMISTRY     : ");
		che=sc.nextInt();
		System.out.print("MATHS         : ");
		mat=sc.nextInt();
		System.out.print("BIOLOGY       : ");
		bio=sc.nextInt();
		mbbs=((phy+che)/4+(bio/2));
		be=((phy+che)/4+(mat/2));
		if (mbbs>=192 && be>=180)
			System.out.println("RESULT      : This Student is eligible for both MBBS and BE");
		else if(mbbs>=192)
			System.out.println("RESULT      : This Student is eligible for MBBS");
		else if(be>=180)
			System.out.println("RESULT      : This Student is eligible for BE");
		else
			System.out.println("RESULT		: This Student is not eligible for both MBBS and BE");
	}
	public static void calculator()
	{
		double a,b,c;
		char s;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n***Calculator***");
		System.out.print("Enter operator of your choice(+,-,*,/,%) : ");
		s=sc.next().charAt(0);
		System.out.print("Number 1 : ");
		a=sc.nextDouble();
		System.out.print("Number 2 : ");
		b=sc.nextDouble();
		switch(s) {
		case('+'):
			c=a+b;
			System.out.println("Addition of the numbers : "+c);
			break;
		case('-'):
			c=a-b;
			System.out.println("Subtraction of the numbers : "+c);
			break;
		case('*'):
			c=a*b;
			System.out.println("Multiplication of numbers : "+c);
			break;
		case('/'):
			c=a/b;
			System.out.println("Division of the numbers : "+c);
			break;
		case('%'):
			c=a%b;
			System.out.println("Modulo of given numbers : "+c);
			break;
		default:
			System.out.println("Enter valid operator ");
		}
	}
	public static void eb()
	{
		double unit, bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n***EB Bill calculation***");
		System.out.print("Enter consumed unit value :");
		unit=sc.nextDouble();
		if(unit<=100)
		System.out.println("No Bill");
		else if(unit>100 && unit<=300)
			{
			bill=(unit-100)*2.5;
			System.out.println("EB Bill :- "+bill);
			}
		else if(unit>300 && unit<=500)
			{bill=(unit-100)*3;
			System.out.println("EB Bill :- "+bill);
			}
		else if(unit>500 && unit<=1000)
			{bill=(unit-100)*5;
			System.out.println("EB Bill :- "+bill);
			}
		else 
			{bill=(unit-100)*7;
			System.out.println("EB Bill :- "+bill);
			}
			
	}
		
	public static void main(String []args)
	{
          IfPrograms obj=new IfPrograms();
          obj.bigger();
          obj.biggest();
          obj.oddeven();
          obj.vote();
          obj.alphabetcase();
          obj.pass();
          obj.cutoff();
          obj.calculator();
          obj.eb();
    }
	
}



