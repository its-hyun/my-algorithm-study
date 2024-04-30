package LeetCode.Combination_Sum_IV;

public class Recursion {
	public int combinationSum4(int[] nums, int target) {
		if (target == 0) {
			return 1;
		}

		int result = 0;
		for (int num : nums) {
			if (num <= target) {
				result += combinationSum4(nums, target - num);
			}
		}

		return result;
	}
}
