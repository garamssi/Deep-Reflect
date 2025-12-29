package section1;

import java.util.Scanner;

public class 문제03_문장_속_단어 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String solution = Solution(str);
		System.out.println(solution);
		in.close();
	}

	public static String Solution(String str) {
		String[] s = str.split(" ");
		int max = 0;
		String result = s[0];
		for(int i=0; i<s.length; i++) {
			if(max < s[i].length()) {
				max = s[i].length();
				result = s[i];
			}
		}

		return result;
	}
}