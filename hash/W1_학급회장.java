package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class W1_학급회장 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 2. 투표 결과 문자열 입력
		String str = sc.next();
		System.out.println(Solution(str, n));
	}

	public static String Solution(String str, int n) {
		Map<String, Integer> answer = new HashMap<>();
		for(int i=0; i<n; i++) {
			char c = str.charAt(i);
			answer.put(c+"", answer.getOrDefault(c+"", 0) + 1);
		}

		return answer.entrySet().stream()
			.max(Map.Entry.comparingByValue())
			.get()
			.getKey();
	}
}
