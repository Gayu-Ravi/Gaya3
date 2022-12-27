package day8.StringArray;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) { 
	  Scanner sc = new Scanner(System.in); 
	  System.out.println("Please enter the sentence : "); 
	  String str = sc.nextLine(); 
	 
	  char inputChArr[] = new char[str.length()]; 
	  for (int i = 0; i < str.length(); i++) { 
	   inputChArr[i] = str.charAt(i); 
	  } 
	  int charCount = 0; 
	  int wordCount = 0; 
	  int vowelCount = 0; 
	  int spclCharCount = 0; 
	  int numCount = 0; 
	  int lineCount = 0; 
	  int temp = 0; 
	  for (int i = 0; i < inputChArr.length; i++) { 
	   if (inputChArr[i] == ' '||inputChArr[i] == '\n'||(i==inputChArr.length-1)) { 
	    int endIndex =i==inputChArr.length-1?i :i - 1; 
	    char subStringArr[] = SubString.seggregate(temp, endIndex, str); 
	    boolean isnumber = checkAllNum(subStringArr); 
	    if (isnumber) { 
	     numCount++; 
	    } else { 
	     wordCount++; 
	     for (int j = 0; j < subStringArr.length; j++) { 
	      if (subStringArr[j] >= 65 && subStringArr[j] <= 90 
	        || subStringArr[j] >= 97 && subStringArr[j] <= 122) { 
	       charCount++; 
	       if (subStringArr[j] == 'A' || subStringArr[j] == 'a' || subStringArr[j] == 'E'|| 
	          subStringArr[j] == 'e'||  subStringArr[j] == 'I' || subStringArr[j] == 'i'|| 
	          subStringArr[j] == 'O' || subStringArr[j] == 'o' || subStringArr[j] == 'U' 
	         || subStringArr[j] == 'u') { 
	        vowelCount++; 
	       } 
	      } else if (subStringArr[j] >= '0' && subStringArr[j] <= '9') { 
	       numCount++; 
	      } else { 
	       spclCharCount++; 
	      } 
	     } 
	    } 
	 
	    temp = i + 1; 
	   } 
	  } 
	  System.out.println("Characters count: "+charCount); 
	  System.out.println("Words count: "+wordCount); 
	  System.out.println("Vowels count: "+vowelCount); 
	  System.out.println("Special characters count: "+spclCharCount); 
	  System.out.println("Numbers count: "+numCount); 
	  System.out.println("Lines count: "+lineCount); 
	 
	 }

	private static boolean checkAllNum(char[] subStringArr) {
		for (int i = 0; i < subStringArr.length; i++) {
			if (!(subStringArr[i] >= '0' && subStringArr[i] <= '9')) {
				return false;
			}
		}
		return true;
	}
}


