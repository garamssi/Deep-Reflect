package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class W5_쇠막대기 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(solution(str));
		kb.close();
	}

	public static int solution(String str) {
		Deque<Character> stack = new ArrayDeque<>();

		int answer = 0;

		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='('){
				stack.push(str.charAt(i));
			} else {
				stack.pop();
				if(str.charAt(i-1)=='('){
					answer+=stack.size();
				} else {
					answer++;
				}

			}
		}
		return answer;
	}

}
