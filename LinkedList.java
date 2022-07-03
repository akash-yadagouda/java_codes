class Node {
	int data;
	Node next;

	Node() {}

	Node(int data) {
		System.out.println("Node prepared");
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	public Node head;

	LinkedList() {
		this.head = null;
	}
	LinkedList(Node node) {
		this.head = node;
	}

	public void add(Node head, int data) {

		final Node node = new Node(data);

		if (head == null) {
			System.out.println("LinkedList started now");
			head = new Node(data);
			return;
		} else {
			Node tempNode = head;

			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}

			tempNode.next = new Node(data);
			System.out.printf("Node added Successfully with value : %d", data);
			return ;

		}

	}

}