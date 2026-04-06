package stack_queue;

import java.util.*;
import java.io.*;

import com.sun.tools.javac.Main;

class W8_응급실 {

	public static void main(String[] args) throws IOException{
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int m = kb.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = kb.nextInt();
		}

		System.out.println(solution(n, m, arr));
	}

	public static int solution(int n, int m, int[] arr){
		int answer=0;
		Queue<Person> Q = new LinkedList<>();

		for(int i=0; i<n; i++){
			Q.offer(new Person(i, arr[i]));
		}

		while(!Q.isEmpty()){
			Person tmp = Q.poll();
			for(Person x : Q){
				if(x.priority > tmp.priority){
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null){
				answer++;
				if(tmp.id == m) return answer;
			}
		}
		return answer;
	}

	public static class Person{
		int id;
		int priority;
		public Person(int id, int priority){
			this.id = id;
			this.priority = priority;
		}
	}

}
