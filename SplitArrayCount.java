public class SplitArrayCount {
	public static void main(String[] args) {
		System.out.println("hi");
		// int arr[] = {1};
		// int arr[] = {7, 2, 9, 10, 9, 8};
		// int arr[] = {7, 2, 9, 19};
		// int arr[] = {7, 2, 9, 10, 9, 8};
		int arr[] = {5, 2, 4, 1, 3, 6, 0};

		System.out.println(getAns(arr, 9));
		// int ans = getAns(arr);
	}

	public static int getAns(int arr[], int givenSum) {

		int sum = 0;
		int counter = 0;

		int i = 0;

		while (i < arr.length) {
			sum = sum + arr[i];

			if (sum == givenSum) {
				sum = 0;
				counter++;
				i++;
			} else if (sum > givenSum) {
				sum = 0;
				counter++;
			} else {
				i++;
				if (i >= arr.length) {
					counter++;
					break;
				}
			}

		}
		return counter;
	}
}