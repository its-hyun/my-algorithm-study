package LeetCode.Nearest_Exit_from_Entrance_in_Maze;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BFSTest {

	BFS bfs = new BFS();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void nearestExit(int testCase) {
		System.out.println(bfs.nearestExit(testCases.getMaze(testCase), testCases.getEntrance(testCase)));
	}
}