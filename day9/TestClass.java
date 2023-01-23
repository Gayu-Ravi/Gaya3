package day9;

import day9.Laptop.Keyboard;

public class TestClass {
	public static void main(String args[]) {
		
		/*Pen pen=new Pen();
		pen.setColor("pink");
		//pen.color="blue";
		System.out.println(pen.getColor());
		

		Human human=new Human("Abcd");
		human.setAlive(true);
		human.walk();
		
		BluePen bluepen=new BluePen();
		pen.setBrand("Reynolds");
		System.out.println(bluepen.getBrand());
		//bluepen.type="ballpoint";

		Calculator calc=new ScientificCalculator();
		double c=calc.add(8, 67);
		System.out.println(c);*/
		
		Student std=new Student();
		std.name="Nithish";
		std.rollno="20KB123";
		Student std1=new Student();
		std1.name="Gayathri";
		std1.rollno="abc123";
		

		Student.Marks mark=new Student().new Marks();
		mark.english=2;
		mark.tamil=1;
		mark.maths=1;
		mark.science=1;
		mark.social=2;
		mark.getTotal();
		std.abc=mark;
		
		Student.Marks mark1=new Student().new Marks();
		mark1.english=99;
		mark1.tamil=99;
		mark1.maths=100;
		mark1.science=100;
		mark1.social=100;
		mark1.getTotal();
		std1.abc=mark1;
		
//		int a = Laptop.Keyboard.key0;
//		System.out.println(a);
//
//		Laptop.Keyboard.press(2);
		
		//StudentCons cons=new StudentCons();
//		MethodOverloading mtd=new MethodOverloading();
//		mtd.add();
//		mtd.add(4, 0);
//		//float c=0.0f;
//		mtd.add(1.2f, 0);
//		mtd.add(2,1.3f );
	}

}
