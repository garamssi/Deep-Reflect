package section1;

import java.util.Scanner;

public class 문제22_7_점수_계산 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		Solution(arr);
		kb.close();
	}
	public static void Solution(int[] answer) {
		int sum = 0;
		int point = 1;
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == 1){
				sum += point;
				point++;
			} else {
				point = 1;
			}
		}
		System.out.println(sum);
	}
}
