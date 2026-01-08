package section1;

import java.util.Scanner;

public class 문제20_5_소수_에라토스테네스 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		Solution(n);
		kb.close();
	}
	public static void Solution(int n) {
		if (n < 2) {
			System.out.println(0);
			return;
		}

		boolean[] isNotPrime = new boolean[n + 1];
		isNotPrime[0] = true;
		isNotPrime[1] = true;

		// i*i <= n까지만 검사하면 충분
		for (int i = 2; i * i <= n; i++) {
			if (!isNotPrime[i]) {
				// i*i부터 시작 (그 이전 배수는 이미 처리됨)
				for (int j = i * i; j <= n; j += i) {
					isNotPrime[j] = true;
				}
			}
		}

		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (!isNotPrime[i]) {
				count++;
			}
		}

		System.out.println(count);
	}
}
