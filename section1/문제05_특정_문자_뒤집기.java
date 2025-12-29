package section1;

import java.util.Scanner;

public class 문제05_특정_문자_뒤집기 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		kb.close();
		String solution = Solution(str);
		System.out.println(solution);
		kb.close();
	}
	public static String Solution(String str) {
		char[] charArray = str.toCharArray();
		int i = 0;
		int lastIndex = charArray.length - 1;

		while (i < lastIndex) {
			if (!Character.isAlphabetic(charArray[i])) {
				i++;
			} else if (!Character.isAlphabetic(charArray[lastIndex])) {
				lastIndex--;
			} else {
				char temp = charArray[i];
				charArray[i] = charArray[lastIndex];
				charArray[lastIndex] = temp;

				i++;
				lastIndex--;
			}
		}
		return String.valueOf(charArray);
	}
}
