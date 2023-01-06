package day9;

/**
 * @author Gayu
 *To demonstrate static cls.
 */
public class Laptop {
	String brand;
	String color;
	int memory;
	
	static class Keyboard{
		char alphabets;
		public static int key0=0;
		static int key1=1;
		static int key2=2;
		
		public static void press(int key) {
			System.out.println("pressing key "+key);
		}
		
		
	}

}
