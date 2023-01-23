package day10.inheritance;

	class SupKey extends SuperKeyword{
		SupKey(){
			System.out.println("Child Constructor");
		}
		 int a=30;
		 int b=20;
		void display() {
			System.out.println("Child Class");
			System.out.println("Value of a(Child class): " + (a+b));//50
			System.out.println("Value of a(super): " + (super.a+b));//60
		}
		}
	


