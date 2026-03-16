package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class W3_크레인_인형뽑기 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] board = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				board[i][j] = kb.nextInt();
			}
		}

		int m = kb.nextInt();
		int[] moves = new int[m];
		for(int i=0;i<m;i++){
			moves[i] = kb.nextInt();
		}
		System.out.println(solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves){
		int answer = 0;
		Deque<Integer> stack = new ArrayDeque<>();

		for(int move : moves) {
			for(int i=0; i<board.length; i++){
				if(board[i][move-1] != 0){
					int tmp = board[i][move-1];
					board[i][move-1] = 0;
					if(!stack.isEmpty() && stack.peek() == tmp){
						answer += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}
					break;
				}
			}
		}

		return answer;
	}
}
