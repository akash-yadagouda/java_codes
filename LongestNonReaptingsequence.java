class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();

		sol.lengthOfLongestSubstring("abcabcbb");
	}



	public int lengthOfLongestSubstring(String s) {

		int[] arr = new int[250];
		int tempAns = 0;
		int globalAns = 0;

		for (int i = 0; i < s.length(); i++) {
			int pos = (int)s.charAt(i);
			if (arr[pos] == 1) {
				int tempans = sumArrClear(arr);
				if (tempAns > globalAns) {
					System.out.println(tempAns + " " + globalAns);
					globalAns = tempAns;
				}
				arr[pos]++;
			}
		}

		return globalAns;
	}
	public static int sumArrClear(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			arr[i] = 0;
		}

		return sum;
	}
}