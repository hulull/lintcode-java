/**
 * 入栈压入stack1，stack2出栈
 * 当stack2为空时，stack1出栈，出栈元素压入stack2
 * 
 * @author Administrator
 *
 */
public class Queue {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	
	public Queue() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}
	public void push(int element) {
		stack1.push(element);
	}
	public int pop() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.peek());
				stack1.pop();
			}
		}
		int ret = stack2.peek();
		stack2.pop();
		return ret;
	}
	public int top() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.peek());
				stack1.pop();
			}
		}
		return stack2.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		System.out.println(q.top());
		q.pop();
		System.out.println(q.top());
	}

}
