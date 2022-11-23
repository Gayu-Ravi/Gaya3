package loopStatements;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String args[]) {
		int a, b, c, sum, factor = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		a = sc.nextInt();
		b = a;
		sum = 0;
		while (a > 0) {
			c = a % 10;
			for (int i = 1; i <= c; i++) {
				factor = factor * i;

				sum = sum + factor;
				a = a / 10;
			}
		}

		if (b == sum) {
			System.out.println("Given number is Strong number");
		} else {
			System.out.println("Given is not a Strong number");
		}
	}

}
