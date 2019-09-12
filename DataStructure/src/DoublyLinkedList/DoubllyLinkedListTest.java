package DoublyLinkedList;

import java.util.Iterator;

public class DoubllyLinkedListTest {

	public static void main(String[] args) {
		LinkedListV_2 list = new LinkedListV_2();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		list.add("I");
		list.add("J");
		list.add("K");
		list.add("L");
		list.add("M");
		//System.out.println(list);
		System.out.println(list.get(4));
		//System.out.println(list.get(14));
		System.out.println(list.indexOf("H"));
		System.out.println(list.contains("M"));
		list.remove("J");
		System.out.println(list);
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
