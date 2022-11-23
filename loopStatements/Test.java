package loopStatements;

public class Test {
	public static void main(String args[]) {
		
	
	for (int i=4; i<=100; i++) {
		  boolean isDivisible = false;
		  for(int j=i-1; j>=2; j--) {
		    if(i%j==0) { 
		      isDivisible = true;
		      break;
		    }
		  }
		  if(!isDivisible) {
		    System.out.println(i);
		  }
		}
	}

}
