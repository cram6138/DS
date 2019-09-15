package queue;

public class LinkedQueue<E> {
	private Node front;
	private Node end;
	private int size;
	
	public void enqueue(E obj) {
		addNode(obj);
	}
	
	private void addNode(E obj) {
		Node node = new Node(obj);
		if(end == null) {
			front = end = node;
		} else {
			end.next = node;
			end = node;
		}
		size++;
	}
	
	public E dqueue() {
		E data = (E) front.value;
		front = front.next;
		size--;
		return data;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
		return size() <= 0;
	}

	private static class Node {
		Object value;
		Node next;
		
		public Node(Object obj) {
			this.value = obj;
		}
	}
}
