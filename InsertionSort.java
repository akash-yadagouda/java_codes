import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {

		int[] arrEmpty = new int[] {};

		insertionSort(arrEmpty);

		System.out.println("hi");
		int arr[] = {3, 2, 1};
		insertionSort(arr);

		int arr1[] = { -1, -2};
		insertionSort(arr1);


		// creating a big array
		Random rand = new Random();

		int[] randArr = new int[100];

		for (int i = 0; i < 100; i++) {
			randArr[i] = rand.nextInt(100);
		}
		insertionSort(randArr);
	};

	static void insertionSort(int arr[]) {
		System.out.println("Before Sort :" + Arrays.toString(arr));
		int temp = 0;
		// for loop o -> n-1-1
		for (int i = 0; i <= arr.length - 2; i++) {
			int element = arr[i + 1];

			for (int j = i + 1; j >= 1 ; j--) {

				if (!(arr[j - 1 ] > arr[j])) {
					continue;
				} else {
					// moveArrayElement(arr, j - 1, i + 1, element);
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}


			}
		}
		// for loop j = i+1 -> j>=0

		System.out.println("After Sort: " + Arrays.toString(arr));
	}

	// static void moveArrayElement(int arr[], int from, int end, int element) {

	// 	System.out.println("array before swap :" + Arrays.toString(arr));

	// 	int temp;
	// 	for (int i = from ; i != end + 1 && from != arr.length ; i++) {
	// 		arr[i + 1] = arr[i];
	// 	}

	// 	arr[from] = element;

	// 	System.out.println("Arrays after swap :" + Arrays.toString(arr));

	// }

}