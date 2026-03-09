package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class W1_괄호문자제거 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
		sc.close();
	}

	public static String solution(String str) {
		Deque<Character> stack = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (!stack.isEmpty()) stack.pop();
			} else if (stack.isEmpty()) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
