public class Solution {
	
	public boolean isValidParentheses(String s) {
		if (s == null || s.length() == 0)
			return false;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && ((stack.peek() == '(' && s.charAt(i) == ')')
					|| (stack.peek() == '[' && s.charAt(i) == ']') 
					|| (stack.peek() == '{' && s.charAt(i) == '}')))
				stack.pop();
			else
				stack.push(s.charAt(i));
		}
		if (stack.isEmpty())
			return true;
		return false;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		String s = "";
		String s1 = "()[]{}";
		String s2 = "([)]";
		System.out.println(solution.isValidParentheses(s));
		System.out.println(solution.isValidParentheses(s1));
		System.out.println(solution.isValidParentheses(s2));
	}
}
