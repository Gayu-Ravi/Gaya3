package day9;

public class StaticDemo {
	static int a = 10; // int a=10

	public static void staticmtd() {  	// public void staticmtd()
		System.out.println("Static method");
	}

	static {
		System.out.println("Static block");
	}

	public static void main(String args[]) {
		System.out.println(a); //StaticDemo sd=new StaticDemo();
		staticmtd(); // sd.staticmtd();

	}
}
