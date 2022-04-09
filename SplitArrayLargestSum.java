import java.io.*;
import java.util.*;

public class SplitArrayLargestSum {
	public static void main(String[] args) {


		// System.out.println("hi");
		// int arr[] = {1, 2, 3, 4, 5};
		// int m = 2		int

		int arr1[] = {5, 2, 4, 1, 3, 6, 0}; // 21
		int m1 = 4;
		System.out.println("Ans : " + splitArray(arr1, m1));

		int arr[] = {7, 2, 5, 10, 8};
		int m = 2;

		// // 18
		int ans ;
		// // = getSpiltArrayCount(arr, 17);
		// // System.out.println(ans);
		// // int min = getMax(arr);
		// // System.out.println("min :" + min);

		ans = splitArray(arr, m);
		System.out.println("ans :" + ans);
	}
	public static int splitArray(int[] nums, int m) {

		return getAns(nums, m);

	}

	public static int getAns(int arr[] , int m) {

		// Scanner scan = new Scanner(System.in);

		int maxArray = getSum(arr);
		int minArray = getMax(arr);
		int start, mid , end;
		mid = -1;
		start = minArray;
		end = maxArray;

		while (start != end) {
			// System.out.println("inside while");


			mid = (start + end) / 2;

			// System.out.println("enter the num");

			// int dummy = scan.nextInt();
			// System.out.println(dummy);
			System.out.println("mid :" + mid + "Start :" + start + " end :" + end );
			int p = getSpiltArrayCount(arr, mid);
			System.out.println("p :" + p);
			// System.out.println("mid :" + mid + "Start :" + start + " end :" + end );

			if (p <= m) {
				end = mid  ;
			} else if (p > m) {
				start = mid + 1;
			}

		}
		return start;
	}

	public static int getSpiltArrayCount(int arr[], int givenSum) {

		int sum = 0;
		int counter = 0;

		int i = 0;

		while (i < arr.length) {
			sum = sum + arr[i];

			if (sum > givenSum) {
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

	public static int getMax(int arr[]) {
		int min = Integer.MIN_VALUE;
		// System.out.println("Integer Max :" + min);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int getSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int getSpiltArrayCountByKunal(int nums[], int mid) {
		int sum = 0;
		int p = 1;

		for (int num : nums) {
			if (sum + num > mid) {
				sum = num;
				p++;
			} else {
				sum += num;
			}
		}
		return p;
	}
}