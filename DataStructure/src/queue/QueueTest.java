package queue;

public class QueueTest {

	public static void main(String[] args) {
		LinkedQueue<String> st = new LinkedQueue();
		
		st.enqueue("C");
		st.enqueue("D");
		st.enqueue("E");
		st.enqueue("F");
		st.enqueue("G");
		st.enqueue("H");
		System.out.println(st.size());
		st.dqueue();
		st.dqueue();
		System.out.println(st.size());
		st.enqueue("I");
		st.dqueue();
		System.out.println(st.size());
		st.enqueue("J");
		System.out.println(st);
		for (int i = 0; 1<1000000; i++) {
			st.enqueue("A"+i);
		}
		
	}

}
