package section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 문제04_문자_뒤집기 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();

		kb.nextLine();

		List<String> strList = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			strList.add(kb.nextLine());
		}
		for (String str : strList) {
			String result = Solution(str);
			System.out.println(result);
		}

	}
	public static String Solution(String input) {
		return new StringBuilder(input).reverse().toString();
	}
}
