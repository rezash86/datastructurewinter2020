package tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Task1 {

	public static void reversArray(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
			
		while (!stack.isEmpty()) {
			Integer number = stack.pop();
			System.out.print(number + "  ");
		}

	}
	
	public static void createSpecialString(char[] chars) {
		Deque<Character> dq = new ArrayDeque<Character>();
		
		//{a,b,c,d}
		for (int i = 0; i < chars.length; i++) {
			dq.addFirst(chars[i]);
			dq.addLast(chars[i]);
		}
		//{dcbaabcd}
		dq.stream().forEach(c->System.out.print((char)c + " " ));
		
		System.out.println();
		System.out.print(dq.toString());
	}

}
