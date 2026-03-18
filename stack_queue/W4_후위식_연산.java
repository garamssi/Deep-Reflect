package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class W4_후위식_연산 {
	public static void main() {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();

		kb.close();
		System.out.println(solution(str));
	}

	public static int solution(String str) {
		int answer = 0;
		Deque<Integer> stack = new ArrayDeque<>();
		for(char c : str.toCharArray()){
			if(Character.isDigit(c)) {
				stack.push(c-48);
			} else {
				int b = stack.pop();
				int a = stack.pop();
				switch(c) {
					case '+':
						stack.push(a+b);
						break;
					case '-':
						stack.push(a-b);
						break;
					case '*':
						stack.push(a*b);
						break;
					case '/':
						stack.push(a/b);
						break;
				}
			}
		}

		answer = stack.peek();
		return answer;
	}
}
