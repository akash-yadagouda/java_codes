public class FindInMountainArray {

	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 4, 2, 1}; // length = 10;
		int target = 3;
		int peak = peakIndexInMountainArray(arr);
		System.out.println("peak" + peak);
		int ans = binarySearchWithRange(arr, target, 0, peak);
		if (ans != -1) {
			System.out.println(ans);
		} else {
			System.out.println(binarySearchWithRange(arr, target, peak + 1, arr.length - 1));
		}

		// System.out.println(binarySearchWithRange(arr,target,0,5));

	}

	public static int binarySearchWithRange(MountainArray mountainArr, int target, int start, int end) {
		int mid = 0;

		boolean asc = mountainArr.get(end) - mountainArr.get(start) > 0;


		if (asc) {
			while (start <= end) {
				mid = start + (end - start) / 2; //  6 + (9-6)/2 = 7
				System.out.println("Hi");
				if (mountainArr.get(mid) < target) { // 6 < 2;
					start = mid + 1;
				} else if (mountainArr.get(mid) > target) { // 6 >
					end = mid - 1;
				} else {
					return mid;
				}
			}
			return -1 ;
		} else {
			while (start <= end) {
				mid = start + (end - start) / 2;// 6 + (9-6)/2 = 7
				System.out.println("Hi");
				if (mountainArr.get(mid) > target) { // 6 < 2;
					start = mid + 1;
				} else if (mountainArr.get(mid) < target) { // 6 >
					end = mid - 1;
				} else {
					return mid;
				}
			}
			return -1 ;
		}
	}
	public static int peakIndexInMountainArray(MountainArray mountainArr) {
		// {1,2};
		// [0,1]
		int start, mid = -1, end;
		start = 0;
		end = mountainArr.length() - 1; // 1

		while (start != end) { // 0 < 1
			mid = start + (end - start) / 2; // 0 + (1 - 0) /2 = 0

			// see left right in which direction growth is there.
			// no growth found in the array element then we found the point.
			boolean rightGrowth =  mountainArr.get(mid + 1) - mountainArr.get(mid) > 0 ; // 10 - 2 = 8
			boolean leftGrowth =  mid - 1 > -1 ? mountainArr.get(mid - 1) - mountainArr.get(mid) > 0 : false; // 1 - 2 = -1

			// if growth is right of the array
			// then start = mid + 1;
			if (rightGrowth) {
				start = mid + 1; // 2
				// if growth is left of the array
				// then end = mid - 1;
			} else if (leftGrowth) {
				end = mid - 1; // 2
			} else {
				return mid;
			}
		}
		return start;
	}
}