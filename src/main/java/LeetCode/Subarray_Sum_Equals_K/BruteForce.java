package LeetCode.Subarray_Sum_Equals_K;

// Time Limit Exceeded...
public class BruteForce {
	public int subarraySum(int[] nums, int k) {
		int count = 0;
		for (int start = 0; start < nums.length; start++) {
			for (int end = start + 1; end <= nums.length; end++) {
				int sum = 0;
				for (int i = start; i < end; i++)
					sum += nums[i];
				if (sum == k)
					count++;
			}
		}
		return count;
	}
}
