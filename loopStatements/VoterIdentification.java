package loopStatements;


	import java.util.Scanner;

	public class VoterIdentification {
	  public static void main(String args[]) {
	    int age;
	    String name;
	    char gender, condition ='N';
	    int male = 0,female =0,eligibleCount = 0,eligibleMale=0,eligibleFemale=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("***Vote Eligibility***");
	    do {
	      System.out.println("Enter Name    : ");
	      name = sc.nextLine();
	      System.out.println("Gender(M/F)   : ");
	      gender = sc.next().charAt(0);
	      System.out.println("Age           : ");
	      age = sc.nextInt();
	      if (gender == 'M' && age >= 18) {
	        male++;
	        eligibleCount++;
	        eligibleMale++;
	        System.out.println("Mr." + name + " is Eligible to vote");
	      }
	      else if (gender == 'F' && age >= 18)
	      {
	        female++;
	        eligibleCount++;
	        eligibleFemale++;
	        System.out.println("Ms/Mrs." + name + " is Eligible to vote");
	      }
	      else {
	        
	        if(gender == 'M')
	          male++;
	        else
	          female++;
	        System.out.println("This person is not eligible for vote");
	        
	      }
	      
	      System.out.println("Do you want to continue(y/n) : ");
	      condition = sc.next().charAt(0);
	    } while (condition == 'y');

	    System.out.println("Total Male  :"+male);
	    System.out.println("Total Female :"+female);
	    System.out.println("Total Eligible :"+eligibleCount);
	    System.out.println("Eligible Male :"+eligibleMale);
	    System.out.println("Eligible Female :"+eligibleFemale);
	    
	  }
	}


