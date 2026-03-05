package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class W4_모든_아나그램_찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = sc.next();   // "bacaAacba"
		String str2 = sc.next();   // "abc"

		// 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
		// 예시 출력 : 3
		System.out.println(solution(str1, str2));

		sc.close();
	}

	public static int solution(String targetStr, String compareStr) {
		Map<Character, Integer> targetMap = new HashMap<>();
		Map<Character, Integer> compareMap = new HashMap<>();
		int k = compareStr.length();
		for(int i=0; i<k; i++){
			compareMap.put(compareStr.charAt(i), compareMap.getOrDefault(compareStr.charAt(i), 0) + 1);
			if(i < k-1){
				targetMap.put(targetStr.charAt(i), targetMap.getOrDefault(targetStr.charAt(i), 0) + 1);
			}
		}

		int answer = 0;
		int lt = 0;
		for (int rt = k - 1; rt < targetStr.length(); rt++) {
			char c = targetStr.charAt(rt);
			targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);

			if(targetMap.equals(compareMap)){
				answer++;
			}

			char left = targetStr.charAt(lt);
			targetMap.put(left, targetMap.get(left) - 1);
			if (targetMap.get(left) == 0) targetMap.remove(left);

			lt++;
		}

		return answer;
	}
}
