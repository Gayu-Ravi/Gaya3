package day8.arrayprograms;
import java.util.Scanner;
public class ReverseOrder {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + "th element ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Reverse Order: ");
		for (int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

		System.out.println("Given Order: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
