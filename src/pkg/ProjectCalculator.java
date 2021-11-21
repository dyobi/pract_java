package pkg;

import java.util.ArrayList;
import java.util.Stack;

public class ProjectCalculator {
	
	public static ArrayList<String> subCal(ArrayList<String> arr) {
		
		int i = 0;
		
		ArrayList<String> tmp = new ArrayList<String> ();
		
		while (arr.get(i).charAt(0) >= '0' && arr.get(i).charAt(0) <= '9') i++;
		
		
		
		return arr;
		
	}

	public static void calculatorMain(String input) {
		
		Stack <String> stack = new Stack <String> ();
		ArrayList <String> arr = new ArrayList <String> ();
		
		int check = -99;
		
		for (int i = 0; i < input.length(); i++) {
			
			char tmp = input.charAt(i);
			
			if (tmp == '(') {
				
				stack.push(tmp + "");
				
			} else if (tmp == ')') {
				
				while (!stack.isEmpty() && !"(".equals(stack.peek())) {
					arr.add(stack.pop());
				}
				if ("(".equals(stack.peek())) stack.pop();
				arr = subCal(arr);
				
			} else if ((tmp >= 48 && tmp <= 57) || tmp == '.') {
				
				if (check == i - 1) {
					arr.set(arr.size() - 1, arr.get(arr.size() - 1) + tmp);
				} else arr.add(tmp + "");
				check = i;
				
			} else if (tmp == '*' || tmp == '/' || tmp == '+' || tmp == '-') {
				stack.push(tmp + "");
			}
		}
		System.out.println(arr);
		System.out.println(stack);
	}

	public static void main(String[] args) {

		String input = "4*(12/3+7)";
		calculatorMain(input);

	}

}
