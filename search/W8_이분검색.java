package search;

import java.util.Arrays;
import java.util.Scanner;

public class W8_이분검색 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = kb.nextInt();
		}

		Arrays.sort(arr);

		System.out.println(solution(n, m, arr));
	}

	public static int solution(int n, int m, int[] list) {
		int lt = 0;
		int rt = n - 1;

		while(lt <= rt) {
			int mid = (lt + rt) / 2;

			if(list[mid] == m) {
				return mid + 1;
			} else if(list[mid] > m) {
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}

		return -1;
	}
}