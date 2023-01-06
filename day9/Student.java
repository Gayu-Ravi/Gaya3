package day9;

/**
 * @author Gayu
 *To demonstrate inner cls.
 */
public class Student {
	String name;
	int standard;
	String rollno;
	
	public void read() {
		System.out.println(name+ " is reading. ");
	}
	public class Marks{
		int tamil;
		int english;
		int maths;
		int science;
		int social;
		int total;
		
		
		
		
		public void count() {
			this.total=this.tamil+this.english+this.maths+this.science+this.social;
		}
	}

}
