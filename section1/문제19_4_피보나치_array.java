package section1;

import java.util.Scanner;

public class 문제19_4_피보나치_array {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		Solution(n);

		kb.close();
	}
	public static void Solution(int n) {

		int a = 1, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int temp = a + b;
			a = b;
			b = temp;
		}
	}
}
