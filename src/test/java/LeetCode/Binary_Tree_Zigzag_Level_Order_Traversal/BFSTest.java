package LeetCode.Binary_Tree_Zigzag_Level_Order_Traversal;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Binary Tree Zigzag Level Order Traversal - BFS Solution")
class BFSTest {

	BFS bfs = new BFS();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void zigzagLevelOrder(int testCase) {
		List<List<Integer>> result = bfs.zigzagLevelOrder(testCases.getRoot(testCase));
		assertThat(testCases.isAnswer(testCase, result)).isTrue();
	}
}