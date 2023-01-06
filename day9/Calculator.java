package day9;

/**
 * @author Gayu
 * To Demonstrate Abstract cls
 */
public abstract class Calculator {
	String brand;
	String type;                    
	String length;
	String breadth;
	String color;
	public double add(double a, double b){
		double c=a+b;
		System.out.println("Calling add method in parent class ");
		return c;
		} 
	public abstract double sub(double a, double b);
 
}

