import java.io.*;
import java.util.*;

public class SplitArrayLargestSum {
	public static void main(String[] args) {


		System.out.println("hi");
		int arr[] = {7, 2, 5, 10, 8};
		int m = 2;
		// 18
		int ans = getSpiltArrayCount(arr, 17);
		System.out.println(ans);
		int min = getMin(arr);
		System.out.println("min :" + min);

		ans = getAns(arr, m);
		System.out.println("ans :" + ans);
	}

	public static int getAns(int arr[] , int m) {

		Scanner scan = new Scanner(System.in);

		int maxArray = getSum(arr);
		int minArray = getMin(arr);
		int start, mid , end;
		mid = -1;
		start = minArray;
		end = maxArray;

		while (!(start == end && start == mid)) {
			System.out.println("inside while");


			mid = (start + end) / 2;

			System.out.println("enter the num");

			// int dummy = scan.nextInt();
			// System.out.println(dummy);
			System.out.println("mid :" + mid);
			int p = getSpiltArrayCount(arr, mid);
			System.out.println("p :" + p);
			System.out.println("mid :" + mid);

			if (p <= m) {
				end = mid - 1;
			} else if (p > m) {
				start = mid + 1;
			}

		}
		return start;
	}

	public static int getSpiltArrayCount(int arr[], int maxSum) {

		int i = 0;
		int sum = 0;
		int count = 0; // 2

		while (i < arr.length) { // 4 < 5

			System.out.println("Inside while split array");
			// System.out.println("sum :" + sum + " " + arr[i]);

			sum += arr[i]; //

			// System.out.println("sum :" + sum + " " + arr[i]);
			if (sum >= maxSum) { // 18 > 17
				sum = 0;
			} else {
				i++;
			}
			if (sum == 0) {
				count++;
				sum = 0;
			}
		}

		return count;

	}

	public static int getMin(int arr[]) {
		int min = Integer.MAX_VALUE;
		System.out.println("Integer Max :" + min);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
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
}