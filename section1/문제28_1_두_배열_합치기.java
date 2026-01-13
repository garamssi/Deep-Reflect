package section1;

import java.util.Arrays;
import java.util.Scanner;

public class 문제28_1_두_배열_합치기 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);


		int a = kb.nextInt();
		int[] list1 = new int[a];

		for (int i = 0; i < a; i++) {
			list1[i] = kb.nextInt();
		}

		int b = kb.nextInt();
		int[] list2 = new int[b];

		for (int i = 0; i < b; i++) {
			list2[i] = kb.nextInt();
		}

		Solution(list1, list2);

		kb.close();
	}
	public static void Solution(int[] a, int[] b) {

		int[] list = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				list[k++] = a[i++];
			} else {
				list[k++] = b[j++];
			}
		}

		while (i < a.length) {
			list[k++] = a[i++];
		}

		while (j < b.length) {
			list[k++] = b[j++];
		}

		String result = Arrays.toString(list);
		System.out.print(result.substring(1, result.length() - 1));
	}
}
