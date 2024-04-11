package LeetCode.Subarray_Sum_Equals_K;

import java.util.HashMap;

public class HashTable {
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		int sum = 0;
		HashMap<Integer, Integer> sumMap = new HashMap<>();
		sumMap.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sumMap.containsKey(sum - k)) {
				count += sumMap.get(sum - k);
			}
			sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
		}

		return count;
	}
}
