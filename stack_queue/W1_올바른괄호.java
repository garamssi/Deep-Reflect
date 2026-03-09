package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class W1_올바른괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
		sc.close();
	}

	public static String solution(String str) {
		Deque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		return stack.isEmpty() ? "YES" : "NO";
	}
}
