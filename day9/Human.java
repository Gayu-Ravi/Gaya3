package day9;

/**
 * @author Gayu
 * To demonstrate Final Class
 */
public final class Human {
	String species;
	String gender;
	int age;
	String color;
	String name;
	boolean isAlive=true;
	public Human(String name) {
		this.name=name;
	}
	
	public void walk() {
		if(this.isAlive) {
			System.out.println(this.name+" is Walking");
		}
		else {
			System.out.println(this.name+ " is no more. ");
		}
		
	}

	public void eat( String food ) {
		if(this.isAlive) {
			System.out.println(this.name+" is eating "+ food);
		}else {
			System.out.println(this.name+ " is no more. ");
		}
		
	}
	public void sleep() {
		if(this.isAlive) {
			System.out.println(this.name+" is sleeping");
		}else {
			System.out.println(this.name+ " is no more. ");
		}
		
	}
	public void live(String place) {
		if(this.isAlive) {
			System.out.println(this.name+" is living in "+place);
		}else {
			System.out.println(this.name+ " is no more. ");
		}
		
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
}
