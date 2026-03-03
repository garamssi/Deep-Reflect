package list;

import java.util.Scanner;

public class 문제30_3_최대매출_Sliding_window {
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
	public static void Solution(int[] a, int k) {
		int sum = 0;
		int maxVal = 0;

		// 1. 처음 K일간의 합을 미리 구함
		for (int i = 0; i < k; i++) {
			sum += a[i];
		}
		maxVal = sum;

		// 2. 슬라이딩 윈도우: 한 칸씩 옆으로 밀면서 계산
		// i는 새로 추가될 오른쪽 끝 인덱스
		for (int i = k; i < a.length; i++) {
			// (현재 합 + 새로 들어온 값 - 나가는 왼쪽 값)
			sum += (a[i] - a[i - k]);
			maxVal = Math.max(maxVal, sum);
		}

		System.out.println(maxVal);
	}
}
