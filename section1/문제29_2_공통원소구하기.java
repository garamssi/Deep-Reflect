package section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 문제29_2_공통원소구하기 {
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
		int[] array1 = Arrays.stream(a).sorted().toArray();
		int[] array2 = Arrays.stream(b).sorted().toArray();

		int index1 = 0, index2 = 0;

		List<Integer> result = new ArrayList<>();

		// 두 배열 모두 유효한 범위 내에 있을 때만 반복
		while(index1 < array1.length && index2 < array2.length) {
			if(array1[index1] == array2[index2]) {
				result.add(array1[index1]);
				index1++;
				index2++;
			} else if (array1[index1] < array2[index2]) {
				index1++;
			} else {
				index2++;
			}
		}

		System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
	}
}
