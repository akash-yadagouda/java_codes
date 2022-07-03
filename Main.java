class Node {
	int data;
	Node next;

	Node() {
	}

	Node(int data) {
		// System.out.println("Node prepared");
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	public Node head;
	static int size;

	LinkedList() {
		this.head = null;
	}
	LinkedList(Node node) {
		this.head = node;
	}

	public void add(int data) {

		final Node node = new Node(data);

		if (head == null) {
			// System.out.println("LinkedList started now");
			this.head = new Node(data);
			LinkedList.size += 1;
			return;
		} else {
			Node tempNode = this.head;

			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}

			tempNode.next = new Node(data);
			// System.out.printf("Node added Successfully with value : %d", data);
			LinkedList.size += 1;
			return ;

		}

	}

	public void print() {

		if (this.head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = this.head;

			while (temp.next != null ) {

				System.out.print(temp.data + "->");
				temp = temp.next;

			}

			System.out.println(temp.data);
		}

	}

	public void deleteByIndex(int index) {
		if (index > LinkedList.size) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} else {

			if (index == 0) {
				Node temp = this.head;
				this.head = this.head.next;
				temp.next = null;
				return;
			}

			Node temp = this.head;
			int i = 0;

			while (temp != null) {

				if ( i == index - 1 ) {
					break;
				}
				temp = temp.next;
				i++;
			}

			if (temp.next.next == null) {
				// the deleting element is last one
				Node lastNode = temp.next;
				temp.next = null;
				lastNode = null;
			} else {
				Node deleteNode = temp.next;
				temp.next = temp.next.next;
				deleteNode = null;
			}

		}
	}

	@Override
	public void finalize() {
		System.out.println("Object deleted");
	}
}



class Main {
	public static void main(String[] args) {
		System.out.println("Hi");

		LinkedList linkedList = new LinkedList();

		linkedList.add(10);
		linkedList.add(20);

		for (int i = 0; i < 5; i ++) {
			linkedList.add(i);
		}

		linkedList.print();

		System.out.println(linkedList.size);

		linkedList.deleteByIndex(6);
		linkedList.print();

	}
}