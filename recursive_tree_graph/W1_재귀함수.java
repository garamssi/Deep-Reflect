package recursive_tree_graph;

import java.util.Scanner;

public class W1_재귀함수 {
	public static void main3(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		solution(value);
		scanner.close();
	}

	public static void solution(int maxNum) {
		simpleRecursive(maxNum, 1);
	}

	public static void simpleRecursive(int num, int k) {
		System.out.print(k);
		if(num == k) {
			return;
		}
		System.out.print(" ");
		simpleRecursive(num, k+1);
	}
}
