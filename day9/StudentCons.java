package day9;

/**
 * @author Gayu
 *To demonstrate constructor
 */
public class StudentCons {
	public StudentCons(){
		this("Gayu");
		System.out.println("Default constructor.");
	}
	public StudentCons(String name) {
		this(name, "20GS");
		System.out.println("Parameterised Constructor 1.");
	}
	public StudentCons(String name, String rollNo) {
		//this();
		System.out.println("Parameterised Constructor 2.");
	}
}
