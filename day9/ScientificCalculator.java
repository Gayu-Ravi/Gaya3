package day9;

/**
 * @author Gayu To demonstrate concrete class.
 */
public class ScientificCalculator extends Calculator {
	String model;

	@Override
	public double sub(double a, double b) {
		double c = a - b;
		return c;
	}

	public double divide(double a, double b) {
		double c = a / b;
		return c;
	}

}
