package section1;

import java.util.Scanner;

public class 문제32_5_연속된자연수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Solution(n);
		sc.close();
	}
	public static void Solution(int num) {
		int left = 1;
		int sum = 0;
		int result = 0;
		int m = (num / 2) + 1;

		for (int right = 1; right <= m; right++) {
			sum += right;

			while (sum > num) {
				sum -= left;
				left++;
			}

			if (sum == num) {
				result++;
			}
		}

		System.out.println(result);
	}
}
