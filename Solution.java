
import java.util.*;

class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println("hi");

		HashMap<Integer, Integer> map = sol.prepareMap(250);

		int ans = sol.lengthOfLongestSubstringV1("bbbbb");

		System.out.println("Ans" + ans);
	}



	public int lengthOfLongestSubstringV1(String s) {
		System.out.println("hi");

		int[] arr = new int[250];
		int tempAns = 0;
		int globalAns = 0;
		int flag = 0;
		int i = 0;
		// abca
		while (i < s.length()) { //

			int pos = (int)s.charAt(i);
			// System.out.println(pos);
			if (arr[pos] == 1) {

				i = traversBackAndGetI(s.charAt(i), i, s);
				System.out.println("i =" + i);
				tempAns = sumArrClear(arr);

				System.out.println(tempAns + " " + globalAns);

				if (tempAns > globalAns) {
					// System.out.println(tempAns + " " + globalAns);
					globalAns = tempAns;
				}

				flag = 1;
				i++;

			} else {
				arr[pos]++;
				i++;
			}
		}

		int lastarrsum = sumArrClear(arr);

		globalAns = lastarrsum > globalAns ? lastarrsum : globalAns;

		return flag == 1 ? globalAns : s.length() ;
	}
	public static int sumArrClear(int[] arr) {
		// System.out.println("in sumArrClear");
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			// System.out.println(sum);
			sum = sum + arr[i];
			arr[i] = 0;
			// System.out.println(sum);
		}
		System.out.println("in sum out" + sum);
		return sum;
	}


	public HashMap<Integer, Integer> prepareMap(int size) {
		return new HashMap(size);
	}


	// public int lengthOfLongestSubstringV2(String s, HashMap<Integer, Integer> map) {

	// 	int i = 0;
	// 	int tempAns , globalAns = 0;
	// 	while (i < s.length()) {

	// 		if (map.get(i) == 1) {
	// 			i = traversBackAndGetI((char)map.get(i), i, s);

	// 		}
	// 		map.put()
	// 		tempAns++;

	// 	}

	// }

	public int traversBackAndGetI(char ch, int i, String s) {
		i--;
		while (i >= 0) {

			if (s.charAt(i) == ch) {
				return i;
			}
			i--;
		}
		return 0;

	}




}