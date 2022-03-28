public class FindInMountainArray{

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,20,10,6,5,2}; // length = 10;
		int target = 2;
		int peak = peakIndexInMountainArray(arr);
		System.out.println("peak" + peak);
		int ans = binarySearchWithRange(arr,target,0,peak);
		if(ans != -1){
			System.out.println(ans);
		}else {
			System.out.println(binarySearchWithRange(arr,target, peak+1, arr.length-1));
		}

		// System.out.println(binarySearchWithRange(arr,target,0,5));
		
	}

	public static int binarySearchWithRange(int arr[], int target, int start, int end){
		int mid = 0;

		boolean asc = arr[end] - arr[start] > 0;


		if(asc){
			while(start <= end){ 
				mid = start + (end - start)/2; //  6 + (9-6)/2 = 7
				System.out.println("Hi");
				if(arr[mid] < target){// 6 < 2;
					start = mid + 1;
				}
				else if(arr[mid] > target){ // 6 >
					end = mid - 1;
				}
				else{
					return mid;
				}
			}
			return -1 ;
		}
		else{
			while(start <= end){ 
				mid = start + (end - start) / 2;// 6 + (9-6)/2 = 7
				System.out.println("Hi");
				if(arr[mid] > target){// 6 < 2;
					start = mid + 1;
				}
				else if(arr[mid] < target){ // 6 >
					end = mid - 1;
				}
				else{
					return mid;
				}
			}
			return -1 ;
		}
	}
	public static int peakIndexInMountainArray(int[] arr){
		// {1,2};
		// [0,1]
		int start, mid = -1, end;
		start = 0;
		end = arr.length - 1; // 1

		while (start != end) { // 0 < 1
			mid = start + (end - start) / 2; // 0 + (1 - 0) /2 = 0

			// see left right in which direction growth is there.
			// no growth found in the array element then we found the point.
			boolean rightGrowth =  arr[mid+1] - arr[mid] > 0 ; // 10 - 2 = 8
			boolean leftGrowth =  mid-1 > -1 ? arr[mid-1] - arr[mid] > 0 : false; // 1 - 2 = -1

			// if growth is right of the array 
				// then start = mid + 1;
			if(rightGrowth){
				start = mid + 1; // 2
			// if growth is left of the array 
				// then end = mid - 1;
			}else if (leftGrowth) {
				end = mid - 1; // 2
			}
			else {
				return mid;
			}
		}
		return start;
	}
}