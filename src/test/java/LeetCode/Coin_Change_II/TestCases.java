package LeetCode.Coin_Change_II;

public class TestCases {

	private int[] amount = {5, 3, 10, 500};
	private int[][] coins = {
		{1, 2, 5},
		{2},
		{10},
		{3, 5, 7, 8, 9, 10, 11}
	};
	private int[] expectedAnswer = {4, 0, 1, 35502874};

	public int getAmount(int testCase) {
		return amount[testCase];
	}

	public int[] getCoins(int testCase) {
		return coins[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
