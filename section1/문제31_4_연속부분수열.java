package section1;

import java.util.Scanner;

public class 문제31_4_연속부분수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Solution(arr, k);

		sc.close();
	}
	public static void Solution(int[] list, int num) {
		int sum = 0;
		int left = 0;
		int result = 0;

		for (int right = 0; right < list.length; right++) {
			sum += list[right];

			while (sum > num) {
				sum -= list[left];
				left++;
			}

			if (sum == num) {
				result++;
			}
		}

		System.out.println(result);
	}
}
