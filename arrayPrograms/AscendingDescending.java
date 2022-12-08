package arrayPrograms;

import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int length = sc.nextInt();
		int sortArr[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter Element " + i + " :");
			sortArr[i] = sc.nextInt();
		}
		System.out.print("Enter Ascending/Descending(A/D) : ");
		char operation = sc.next().charAt(0);
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (operation == 'A') {
					if (sortArr[i] > sortArr[j]) {
						int temp = sortArr[i];
						sortArr[i] = sortArr[j];
						sortArr[j] = temp;
						//System.out.print(sortArr);
					}
				} else if (operation == 'D') {
					if (sortArr[i] < sortArr[j]) {
						int temp = sortArr[i];
						sortArr[i] = sortArr[j];
						sortArr[j] = temp;
						//System.out.print(sortArr[j]);
					}
				}
			}}
			for (int i = 0; i < length; i++) {
				System.out.println(sortArr[i]);
			}

		}
	}

