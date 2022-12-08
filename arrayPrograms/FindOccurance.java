package arrayPrograms;
import java.util.Scanner;
public class FindOccurance {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the "+i+ "element ");
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the occurrence number ");
		int n = sc.nextInt();	
		int count = 0;	
		int arrOccrPos[] = new int[length];
		for(int i=0;i<arr.length;i++) {
			if(n==arr[i]) {
				arrOccrPos[count] = i;
				count++;
			}
		}
		
		System.out.println("Total occurrences of  number "+n+" is: "+count);
		if(count!=0) {
			System.out.println("The occurrences index is");
			
			for(int i=0;i<count;i++) {
				System.out.println(arrOccrPos[i]);
			}
	}
}}
