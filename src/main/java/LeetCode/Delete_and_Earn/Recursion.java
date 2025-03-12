package LeetCode.Delete_and_Earn;

import java.util.Arrays;

public class Recursion {

	public int deleteAndEarn(int[] nums) {
		Arrays.sort(nums);
		return getMaximumPoint(nums, 0, 0, 0);
	}

	private int getMaximumPoint(int[] nums, int currentIndex, int currentPoint, int prevNum) {

		if (currentIndex >= nums.length) {
			return currentPoint;
		}
		int currentNum = nums[currentIndex];
		int include = 0;
		if (prevNum == 0 || (currentNum == prevNum) || (currentNum - 1 != prevNum)) {
			include = getMaximumPoint(nums, currentNum, currentIndex + 1, currentPoint + currentNum);
		}
		int exclude = getMaximumPoint(nums, prevNum, currentIndex + 1, currentPoint);
		return Math.max(include, exclude);
	}
}
