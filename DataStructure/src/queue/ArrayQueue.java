package queue;

import java.util.Arrays;

public class ArrayQueue<E> {

	private Object[] queueData;
	private int modeCount = 16;
	private int front;
	private int size;
	private int end;
	
	public ArrayQueue() {
		queueData = new Object[modeCount];
	}
	
	public void enqueue(E obj) {
		addNext(obj);
	}

	private void addNext(E obj) {
		if (end >= modeCount) {
			grow();
		}
		queueData[end] = obj;
		end++;
		size++;
	}

	private void grow() {
		queueData = Arrays.copyOf(queueData, modeCount+8);
	}
	
	public synchronized E dqueue() {
		if(size()<=0) {
			throw new RuntimeException("Queue is empty");
		}
		E data = (E) queueData[front];
		front++;
		size--;
		return data;
	}
	
	public int size() {
		return size;
	}
	
}
