public class BinarySearchInRotatedArray {
	public static void main(String[] args) {
		// System.out.println("hi");
		// int arr[] = {4, 5, 6, 7, 0, 1, 2};
		// System.out.println("Ans :" + getpeak(arr));

		// int arr1[] = {1, 2, 3, 4, 5, 6};
		// System.out.println("Ans :" + getpeak(arr1));

		// int arr2[] = {7, 0, 1, 2, 3};
		// System.out.println("Ans :" + getpeak(arr2));

		// int arr3[] = {11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		// System.out.println("Ans :" + getpeak(arr3));

		// int arr4[] = {2, 1};
		// System.out.println(getpeak(arr4));


		int arr[] = {1};
		int target = 2;
		int ans;

		int peak = getpeak(arr);
		System.out.println("peak : " + peak);

		if (peak == -1) {
			ans = BS(arr, target, 0, arr.length - 1);
		} else if (arr[peak] == target) {
			ans = peak;
		} else {
			ans = BS(arr, target, 0, peak);
			if (ans == -1) {
				ans = BS(arr, target, peak + 1, arr.length - 1);
			}
		}
		System.out.println("Ans : " + ans);
	}

	// public static int rotatedBinarySearch(int arr[], int target) {

	// }
	public static int getpeak(int arr[]) {
		int start, mid, end;
		start = 0;
		end = arr.length - 1; // 1
		if (arr[start] <= arr[end]) {
			return -1;
		}
		while (start != end) { // 0 != 1
			System.out.println(start + " " + end);
			mid = start + (end - start) / 2; // 0
			if (arr[start] < arr[mid]) // 2 < 2
				start = mid; // 3
			else if (arr[start] >= arr[mid]) // 2 > 2
				end = mid ;
			else if ( arr[end] > arr[mid])
				start = mid + 1;
		}
		return start;
	}

	public static int BS(int arr[], int target, int start, int end) {
		int  mid;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid] > target) {
				end = mid - 1;
			} else if ( arr[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

}


// {4, 5, 6, 7, 0, 1, 2}
// [0, 1, 2, 3, 4, 5, 6]

// {1, 2, 3, 4, 5, 6}
// [0, 1, 2, 3, 4, 5]

// {7, 0, 1, 2, 3}
// [0, 1, 2, 3, 4]

// {11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9}
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

// {11, 12, 13, 14, 15, 16, 17, 18, 1, 2}
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

// start = 7
//         end = 9
//               mid = 7 + (9 - 7) / 2 = 8

// while (start != end) { //  7 != 9
// 	if arr[start] < arr[mid] : // 18 < 1
// 		start = mid; //
// 	if arr[start] < arr[end] : // 18 < 2
// 		return end;
// 	if arr[start] > arr[mid] :
// 		return start;
// 	if arr[end] > arr[mid] : // 6 > 5
// 		start = mid + 1; // 5
// }
// return start;


































