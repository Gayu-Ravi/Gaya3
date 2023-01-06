package day9;

import day9.Laptop.Keyboard;

public class TestClass {
	public static void main(String args[]) {
		
		Pen pen=new Pen();
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
		System.out.println(c);

		Student.Marks mark=new Student().new Marks();
		mark.english=2;
		mark.tamil=1;
		mark.maths=1;
		mark.science=1;
		mark.social=1;
		mark.count();
		System.out.println(mark.total);

		int a = Laptop.Keyboard.key0;
		System.out.println(a);

		Laptop.Keyboard.press(2);
		
		
	}

}
