import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("hi");
		int arr[] = {2, 0, 2, 1, 1, 0};
		System.out.println(Arrays.toString(bubbleSort(arr)));

	}

	public static int[] bubbleSort(int arr[]) {

		// for loop n-1;
		// for look n-i-1
		int a;
		boolean check = false;

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(Arrays.toString(arr));

			check = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// System.out.println(arr[j] + " " + arr[j + 1]);
					a = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = a;
					// System.out.println(arr[j] + " " + arr[j + 1]);
					check = true;
				}
			}
			if (check == false) {
				return arr;
			}

		}
		return arr;
	}


	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}