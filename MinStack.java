import java.util.Stack;

public class MinStack {
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	public MinStack() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
	}
	public void push(int number) {
		s1.push(number);
		if (s2.isEmpty() || number <= s2.peek()) //允许有重复的值，所以这里应该是<=
			s2.push(number);
	}
	public int pop() {
		if (s1.peek().equals(s2.peek()))  //两者都是Integer的比较，最好还是用equals，这里如果用==会返回false
			s2.pop();
		return s1.pop();
	}
	public int min() {
		if (s2.isEmpty())
			return Integer.MIN_VALUE;
		return s2.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(152);
		minStack.pop();
		minStack.push(163);
		System.out.println(minStack.min());
		minStack.push(1);
		System.out.println(minStack.min());
	}

}
