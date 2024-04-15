package LeetCode.Nearest_Exit_from_Entrance_in_Maze;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DFSTest {

	DFS dfs = new DFS();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void nearestExit(int testCase) {
		int result = dfs.nearestExit(testCases.getMaze(testCase), testCases.getEntrance(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}