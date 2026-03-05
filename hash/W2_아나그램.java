package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class W2_아나그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(solution(s1, s2));
	}

	public static String solution(String str1, String str2) {
		// 2. Key 타입을 Character로 변경
		Map<Character, Integer> answer1 = new HashMap<>();
		Map<Character, Integer> answer2 = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			// 각각의 맵에 자신의 글자 개수를 카운트함
			char a = str1.charAt(i);
			char b = str2.charAt(i);

			answer1.put(a, answer1.getOrDefault(a, 0) + 1);
			answer2.put(b, answer2.getOrDefault(b, 0) + 1);
		}

		// 3. 두 맵이 같은지 비교 (자바 HashMap의 equals는 내용물을 비교합니다)
		return answer1.equals(answer2) ? "YES" : "NO";
	}
}
