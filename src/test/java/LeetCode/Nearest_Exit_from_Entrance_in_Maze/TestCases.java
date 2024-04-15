package LeetCode.Nearest_Exit_from_Entrance_in_Maze;

public class TestCases {

	private final char[][][] maze = {
		{
			{'+', '+', '.', '+'},
			{'.', '.', '.', '+'},
			{'+', '+', '+', '.'}
		},
		{
			{'+', '+', '+'},
			{'.', '.', '.'},
			{'+', '+', '+'}
		},
		{
			{'.', '+'}
		}
	};

	private final int[][] entrance = {
		{1, 2},
		{1, 0},
		{0, 0}
	};

	private final int[] expectedAnswer = {1, 2, -1};

	public char[][] getMaze(int testCase) {
		return maze[testCase];
	}

	public int[] getEntrance(int testCase) {
		return entrance[testCase];
	}

	public int getExpectedAnswer(int testCase) {
		return expectedAnswer[testCase];
	}
}
