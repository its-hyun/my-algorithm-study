package LeetCode.Binary_Tree_Level_Order_Traversal;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Binary Tree Level Order Traversal - BFS Solution")
class BFSTest {

	private final BFS bfs = new BFS();
	private final TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void levelOrderTest(int testCase) {
		List<List<Integer>> result = bfs.levelOrder(testCases.getRoot(testCase));
		assertThat(testCases.isAnswer(testCase, result)).isTrue();
	}
}