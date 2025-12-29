package section1;

import static java.lang.Character.*;

import java.util.Scanner;

public class 문제02_대소문자_변환 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String firstLine = in.nextLine();

		String result = change(firstLine);
		System.out.println(result);
	}

	public static String change(String str) {
		StringBuilder result = new StringBuilder();

		for(char c : str.toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				result.append(Character.toUpperCase(c));
			} else if(c >= 'A' && c <= 'Z') {
				result.append(Character.toLowerCase(c));
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}
}
