package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class W6_공주구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(solution(n, k));
	}

	/**
	 * 정렬을 한다.
	 */
	public static int solution(int n, int k) {
		Deque<Integer> q = new ArrayDeque<>();
		for(int i=1; i<=n; i++){
			q.offer(i);
		}
		while(!q.isEmpty()){
			for(int j=1; j<k; j++){
				q.offer(q.poll());
			}
			q.poll();
			if(q.size() == 1){
				return q.poll();
			}
		}

		return 0;
	}
}
