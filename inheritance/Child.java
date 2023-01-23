package day10.inheritance;

public class Child extends Parent {
		public static void main(String[] args) {
			Child ch=new Child();
			ch.walk();
			ch.work();
			ch.read();
			ch.play();
		}
		public void read() {
			System.out.println("Reading");
		}
		public void play() {
			System.out.println("Playing");
		}
}
