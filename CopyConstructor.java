package constructor;

public class CopyConstructor {
	String brand;
	String color;
	public CopyConstructor(String bnd, String clr) {
		brand=bnd;
		color=clr;
	}
	public CopyConstructor(CopyConstructor a) {
		brand=a.brand;
		color=a.color;
	}
	public void check() {
		System.out.println("Brand :" +brand +" Color : " +color);
	}
	public static void main(String []args) {
		CopyConstructor cons=new CopyConstructor("aavasa","blue");
		CopyConstructor cc=new CopyConstructor(cons);
		cons.check(); cc.check();
	}

}
