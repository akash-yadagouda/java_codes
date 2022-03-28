
public class binarySearch{



	// try {
	// 		System.setIn(new FileInputStream("input.txt"));
	// 		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
	// 	} catch (Exception e) {
	// 		System.err.println("Error");
	// 	}
	// 	Scanner sc = new Scanner(System.in);
	// 	int n = sc.nextInt();
	// 	System.out.println(n);
	// }
	public static void main(String[] args){
		System.out.println("Hi Akash");
		int arr[] = {1,2,3,4,5,2};
		// int target = 3;
		System.out.println( "Ans :" + (peakIndexInMountainArray(arr)));
		System.out.println("Hi Akash");
	}

	public static int binarySearch(int[] arr, int target){
		int start = 0,mid,end;
		end = arr.length - 1;
		while(start <= end){
			// calculated the mid value 
			mid = start + ( end - start ) / 2;
			// run a loop to find the array

				if(arr[mid] < target){
					start = mid + 1;
				}
				else if(arr[mid] > target){
					end = mid - 1;
				}
				else{
					return mid;
				}
			}
			return -1;
	}

	public static int orderAgnosticSearch(int arr[], int target){
		// array can be ascnding or desending
		boolean ascnding = arr[arr.length] > arr[0];
		if(!ascnding){
			int start, mid, end;
			start = 0;
			end = arr.length - 1;

			while(start <= end){
				mid = start + (end - start) / 2;
				if(arr[mid] < target){
					end = mid - 1;
				}
				else if(arr[mid] > target){
					start = mid + 1;
				}
				else{
					return mid;
				}
			}
		}else{
			return binarySearch(arr,target);
		}
		return -1;
	}

	// public static int binarySearchInInfinityArray(int arr[], inr target){
	// 	//first calculate the prper start and end 
	// 	int start , end;
	// 	start = 0;
	// 	end = 1;
	// 	int newStart =0;

	// 	while(arr[end] < target){ 
	// 		newStart = end + 1;
	// 		end = end + (end - start + 1)*2;
	// 		start = newStart;
	// 	}

	// 	while(start < end) {
	// 		// call for normal binary search
	// 	}
	// }

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
			boolean rightGrowth = mid+1 < arr. ? arr[mid+1] - arr[mid] > 0 : false; // 10 - 2 = 8
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