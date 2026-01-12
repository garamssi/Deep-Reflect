package section1;

import java.util.Scanner;

public class 문제21_6_뒤집은_소수 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}

		StringBuilder sb = new StringBuilder();
		for (int num : arr) {
			int reversed = reverse(num);
			if (isPrime(reversed)) {
				sb.append(reversed).append(" ");
			}
		}

		System.out.println(sb.toString().trim());
		kb.close();
	}

	// 숫자 뒤집기: 90 → 9, 17 → 71
	public static int reverse(int num) {
		int result = 0;
		while (num > 0) {
			result = result * 10 + (num % 10);
			num /= 10;
		}
		return result;
	}

	// 소수 판별
	public static boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
