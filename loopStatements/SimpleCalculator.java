package loopStatements;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String []args) {
		double a,b,c, i=0;
		char s,condition='y',y,n;
		System.out.println("***Calculator***");
		Scanner sc=new Scanner(System.in);
		do{
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
			break;
		}
		System.out.println("Do you want to continue(y/n) : ");
		condition=sc.next().charAt(0);
	}
		
		while(condition=='y'); 
			
		

}}
