package recursive_tree_graph;

import java.util.ArrayList;
import java.util.List;

public class W63_6_부분집합_DFS {

	static int[] arr = {1, 2, 3};
	static boolean[] selected = new boolean[arr.length];

	public static void main(String[] args) {
		dfs(0);
	}

	static void dfs(int depth) {
		// 모든 원소에 대한 선택이 끝나면 현재 부분집합 출력
		if (depth == arr.length) {
			print();
			return;
		}

		// 현재 원소를 포함하는 경우
		selected[depth] = true;
		dfs(depth + 1);

		// 현재 원소를 포함하지 않는 경우
		selected[depth] = false;
		dfs(depth + 1);
	}

	static void print() {
		List<Integer> subset = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (selected[i]) subset.add(arr[i]);
		}
		if(!subset.isEmpty()){
			System.out.println(subset);
		}
	}
}
