import java.util.*;

class MaxHeap {
	private int[] heap;
	private int size;
	private int maxsize;

	MaxHeap(int maxsize){
		this.maxsize = maxsize;
		this.heap = new int[maxsize];
		this.size = 1;
		this.heap[0] = Integer.MIN_VALUE;
	}

	public void insert(int a) {
		//System.out.println(length);
		this.heap[size++] = a; // 

		int current = size - 1;
		int parent ;
		while (current > 1) {

			parent = current / 2;

			if(this.heap[parent] > this.heap[current]){
				this.swap(parent,current);
				current = parent;
			}
			else{
				return;
			}
			
		}
	}

	public void pop(int[] arr ) {

	}

	public void printHeap(){

		 for (int i = 1; i <= size / 2; i++) {
 
            // Printing the parent and both childrens
            System.out.print(
                " PARENT : " + this.heap[i]
                + " LEFT CHILD : " + this.heap[2 * i]
                + " RIGHT CHILD :" + this.heap[2 * i + 1]);
 
            // By here new line is required
            System.out.println();
        }

	}

	public void swap(int a, int b){
		int temp = this.heap[a];
		this.heap[a] = this.heap[b];
		this.heap[b] = temp; 
	}

	public static void main(String[] args) {
		System.out.println("hi");
		MaxHeap maxHeap = new MaxHeap(10);

		//maxHeap.insert(1);
		//maxHeap.printHeap();

		//maxHeap.insert(2);
		//maxHeap.printHeap();


		//maxHeap.insert(-1);
		//maxHeap.printHeap();

		Scanner scan = new Scanner(System.in);
		for(int i =0; i< 10; i++){

			int data = scan.nextInt();

			maxHeap.insert(data);
			maxHeap.printHeap();

		}

	}
}