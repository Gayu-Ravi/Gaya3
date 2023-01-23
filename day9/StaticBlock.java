package day9;

public class StaticBlock {
	public StaticBlock() {
		System.out.println("Hi.. This is  Constructor");
	}

	{
		System.out.println("Hi.. This is  non-static block");
	}
	static {
		System.out.println("Hi.. This is  Static block");
	}

	// Why Static block? ---- Prerequisites
	public static void main(String args[]) {
		System.out.println("Hello from main method");
		StaticBlock sb = new StaticBlock();
		add(1);// static mtd- no need to create object
		sb.test(); // non static mtd- need object
	}

	public static int add(int a) {
		System.out.println("static method");
		return a;
	}

	public void test() {
		System.out.println("non-static method");
	}
}
