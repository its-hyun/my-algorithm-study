package LeetCode.Minimum_Number_of_Operations_to_Make_Array_Empty;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 4};
		int[] nums = {14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12};
		int result = new Solution().minOperations(nums);
		System.out.println(result);
	}

	public int minOperations(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {

			if (!map.containsKey(num)) {
				map.put(num, 1);
				continue;
			}
			Integer i = map.get(num);
			map.put(num, map.get(num) + 1);
		}

		int[] keyArray = map.keySet().stream()
			.mapToInt(Integer::intValue)
			.toArray();

		int ans = 0;
		for (int key : keyArray) {
			int value = map.get(key);

			while (value > 0) {
				if (value == 1) {
					return -1;
				}
				if (value % 3 == 0) {
					ans += value / 3;
					value = 0;
				} else {
					ans += 1;
					value -= 2;
				}
			}
		}

		return ans;
	}
}
