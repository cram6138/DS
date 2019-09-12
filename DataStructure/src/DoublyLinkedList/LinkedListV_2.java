package DoublyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListV_2 implements Iterator<Object>{
	private Node head;
	private Node tail;
	private int length;
	private Node itrNode;
	
	public void add(Object obj) {
		Node node = new Node();
		node.value = obj;
		if(head == null) {
			tail = head = node;
		} else {
			node.previous = tail;
			tail.next = node;
			tail = node;
		}
		length++;
	}
	
	public boolean contains(Object obj) {
		Node node = head;
		while (node != null) {
			if(node.value.equals(obj)) {
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
	public Object get(int index) {
		Node node = head;
		if(index >= length) {
			throw new ArrayIndexOutOfBoundsException("List index out of bounds");
		}
		int i=0;
		while (i!=index) {
			node = node.next;
			i++;
		}
		return node.value;
	}
	
	public int indexOf(Object obj) {
		Node node = head;
		int index = 0;
		while (node != null) {
			if(node.value.equals(obj)) {
				return index;
			}
			node = node.next;
			index++;
		}
		return -1;
	}
	
	public Object getFirst() {
		return head.value;
	}
	
	public Object getLast() {
		return tail.value;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void remove(Object obj) {
		Node node = head;
		while (node != null) {
			if(node.value.equals(obj)) {
				node.previous.next = node.next;
				node.next.previous = node.previous;
				length--;
				return;
			}
			node = node.next;
		}
	}
	
	public Iterator<Object> iterator() {
		
		return this;
	}

	@Override
	public boolean hasNext() {
		return this.itrNode != null;
	}

	@Override
	public Object next() {
		
		return this.itrNode.value;
	}
	
		
}
