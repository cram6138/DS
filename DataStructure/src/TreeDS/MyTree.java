package TreeDS;

public class MyTree {

	private Node head;
	
	public void put(Object obj) {
		Node node = new Node(obj);
		if(head == null) {
			head = node;
		} else {
			checkNextNode(head, node);
		}
	}
	
	private void checkNextNode(Node node, Node nextNode) {
		if(nextNode.hash < node.hash)  {
			checkForLeft(node, nextNode);
		} else {
			checkForRight(node, nextNode);
		}
		
	}

	private void checkForRight(Node node, Node nextNode) {
		if(node.right == null) {
			node.right = nextNode;
		} else {
			checkNextNode(node.right, nextNode);
		}
		
	}

	private void checkForLeft(Node node, Node nextNode) {
		if(node.left == null) {
			node.left = nextNode;
		} else {
			checkNextNode(node.left, nextNode);
		}
		
	}

	private static class Node{
		Node left;
		Node right;
		int hash;
		Object value;
		
		public Node(Object value) {
			this.value = value;
			this.hash = value.hashCode();
		}
	}
}
