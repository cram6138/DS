package DoublyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListV_2 implements Iterator<Object>{
	private Node head;
	private Node tail;
	private int size;
	private int itrSize;
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
		size++;
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
		if(index >= size) {
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
		return size == 0;
	}
	
	public void remove(Object obj) {
		Node node = head;
		while (node != null) {
			if(node.value.equals(obj)) {
				node.previous.next = node.next;
				node.next.previous = node.previous;
				size--;
				return;
			}
			node = node.next;
		}
	}
	
	public Iterator<Object> iterator() {
		this.itrSize = size;
		this.itrNode = head;
		return this;
	}

	@Override
	public boolean hasNext() {
		return this.itrSize > 0;
	}

	@Override
	public Object next() {
		Object value = this.itrNode.value;
		this.itrNode = this.itrNode.next;
		itrSize--;
		return value;
	}
	
	private static class Node {
		Object value;
		Node next;
		Node previous;
	}
	
		
}
