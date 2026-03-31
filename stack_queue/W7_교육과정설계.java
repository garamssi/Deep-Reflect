package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class W7_교육과정설계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(solution(a, b));
	}

	/**
	 * 정렬을 한다.
	 */
	public static String solution(String need, String plan) {
		String answer = "YES";
		Deque<Character> q = new ArrayDeque<>();
		for(char x : need.toCharArray()){
			q.offer(x);
		}
		for(char x: plan.toCharArray()){
			if(q.contains(x)) {
				if(x != q.poll()){
					return "NO";
				}
			}
 		}
		if(!q.isEmpty()){
			return "NO";
		};
		return answer;
	}
}
