package section1;

import java.util.Scanner;

import static java.lang.Character.*;

import java.util.Scanner;

public class 문제01_문자_찾기 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String firstLine = in.nextLine();
		String secondLine = in.nextLine();
		char ch = secondLine.charAt(0);
		in.close();

		Long result = countCharOccurrences(firstLine, ch);
		System.out.println(result);
	}

	public static Long countCharOccurrences(String str, char ch) {
		return str.chars().filter(c -> toUpperCase(c) == toUpperCase(ch)).count();
	}
}
