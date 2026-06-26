package recursive_tree_graph;

import java.util.*;

public class W61_5_피보나치_재귀 {
	// 이미 계산한 결과를 저장해 두는 메모이제이션 캐시
	static Map<Integer, Long> memo = new HashMap<>();

	// 재귀 + 메모이제이션 방식의 피보나치
	static long fib(int n) {
		if (n <= 1) {
			return n;
		}
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		long result = fib(n - 1) + fib(n - 2);
		memo.put(n, result);
		return result;
	}

	public static void main(String[] args) {
		// 0번째부터 10번째까지 피보나치 수 출력
		System.out.print("fib(0)~fib(10): ");
		for (int i = 0; i <= 10; i++) {
			System.out.print(fib(i) + " ");
		}
		System.out.println();

		int n = 50;
		System.out.println("fib(" + n + ") = " + fib(n));
	}
}
