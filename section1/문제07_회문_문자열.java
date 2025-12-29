package section1;

import java.util.Scanner;

/**
 * 강의는 length()/2로 풀었네...
 * 투포인터로 시작과 끝 기준으로 하나 씩 + 하면서 비교함
 */
public class 문제07_회문_문자열 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		kb.close();
		String solution = Solution(s);
		System.out.println(solution);
	}
	public static String Solution(String input) {
		String str1 = input.toUpperCase();
		StringBuilder stringBuilder = new StringBuilder(str1);
		String str2 = stringBuilder.reverse().toString();
		return str1.equals(str2) ? "YES" : "NO";
	}
}
