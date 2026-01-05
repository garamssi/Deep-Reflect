package section1;

import java.util.Scanner;

public class 문제18_3_가위바위보 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}

		Solution(n, a, b);
		scanner.close();
	}

	public static void Solution(int n, int[] a, int[] b) {
		for (int i = 0; i < n; i++) {
			if (a[i] == b[i]) {
				System.out.println("D");
			} else if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2)) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
		}
	}
}
