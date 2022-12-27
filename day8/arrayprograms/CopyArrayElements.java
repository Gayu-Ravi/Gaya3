package day8.arrayprograms;

public class CopyArrayElements {
	public static void main(String[] args) {
		int array1[] = { 3, 4, 5, 6, 7 };
		int array2[] = new int[array1.length];
		System.out.println("Copied Array : ");
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
			System.out.println(array2[i]);
		}
	}
}