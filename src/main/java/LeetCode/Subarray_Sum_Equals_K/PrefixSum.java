package LeetCode.Subarray_Sum_Equals_K;

public class PrefixSum {
	public int subarraySum(int[] nums, int k) {
		int ans = 0;
		int[] prefixSum = new int[nums.length + 1];
		prefixSum[0] = 0;
		for (int i = 1; i < prefixSum.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (prefixSum[j + 1] - prefixSum[i] == k) {
					ans += 1;
				}
			}
		}

		return ans;
	}
}
