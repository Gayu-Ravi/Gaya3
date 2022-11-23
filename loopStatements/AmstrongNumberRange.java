package loopStatements;
public class AmstrongNumberRange 
{
	public static void main(String[] args) 
	{
		int a,b,c,d,sum=0;
		System.out.println("***Amstrong Number between 100 to 999***");
			for(int i=100; i<1000; i++) 
			{
				d=i;
				c=d%10;
				d=d/10;
				b=d%10;
				d=d/10;
				a=d%10;
				sum=(c*c*c)+(b*b*b)+(a*a*a);
				
				if(i==sum) {
					System.out.println(i);
				}
			}
	}
}
