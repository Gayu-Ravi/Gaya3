package day9;

public class MethodOverloading {
		public static void add() {
			System.out.println("empty");
		}
		public  void add(int a, int b) {
			System.out.println("same datatype");
		}
//		public  void add(int a, int b) {
//			System.out.println("same datatype");
//		}
		public static void add(float c, int d) {
			System.out.println("Different datatype");
		}
		public void add(int d,float b) {
			System.out.println("order changed.");
		}
		public  void main(String []args) {
			add();
			add(1, 2);
			MethodOverloading.add(1.0f, 3);
			
		}
	
	
}
	
