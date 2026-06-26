package recursive_tree_graph;

public class W62_5_이진트리순회 {
	// 이진 트리의 노드를 표현하는 클래스
	static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

	// 중위 순회(in-order DFS): 왼쪽 서브트리 -> 루트 -> 오른쪽 서브트리
	static void inorderDfs(Node node) {
		if (node == null) {
			return;
		}
		inorderDfs(node.left);              // 1. 왼쪽 서브트리 방문
		System.out.print(node.value + " "); // 2. 현재 노드 출력
		inorderDfs(node.right);             // 3. 오른쪽 서브트리 방문
	}

	public static void main(String[] args) {
		// 예시 트리 구성
		//          4
		//        /   \
		//       2     6
		//      / \   / \
		//     1   3 5   7
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(7);

		// 중위 순회 결과 출력
		System.out.print("중위 순회 결과: ");
		inorderDfs(root);
		System.out.println();
	}
}
