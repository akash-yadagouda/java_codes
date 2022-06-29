class Node {
	int data;
	Node leftNode, rightNode;


	Node() {
		leftNode = rightNode = null;
	}

	Node(int data) {
		this.data = data;
		this.leftNode = this.rightNode = null;
	}
}

public class BinaryTree {


	public Node head ;

	BinaryTree() {
		this.head = null;
	}

	BinaryTree(int data) {
		this.head = new Node(10);
	}

	public static void main(String[] args) {
		System.out.println("hi");


		BinaryTree binaryTree = new BinaryTree();

		binaryTree.head = new Node(10);

		binaryTree.head.leftNode = new Node(20);

		binaryTree.head.rightNode = new Node(30);


		System.out.println(binaryTree.head.data);

		System.out.println(binaryTree.head.leftNode.data);

		System.out.println(binaryTree.head.rightNode.data);

	}


}
