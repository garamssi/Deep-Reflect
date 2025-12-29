package section1;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 강의는 indexOf로 풀었네...
 */
public class 문제06_중복문자제거 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		kb.close();
		String solution = Solution(s);
		System.out.println(solution);
	}
	public static String Solution(String input) {
		return input.chars()
			.mapToObj(c -> (char) c)
			.distinct()
			.map(String::valueOf)
			.collect(Collectors.joining());
	}
}
