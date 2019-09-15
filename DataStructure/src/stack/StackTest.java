package stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			stack.push("str" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
