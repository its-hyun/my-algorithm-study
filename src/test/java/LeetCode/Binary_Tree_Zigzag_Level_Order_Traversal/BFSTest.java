package LeetCode.Binary_Tree_Zigzag_Level_Order_Traversal;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Binary Tree Zigzag Level Order Traversal - BFS Solution")
class BFSTest {

	private final BFS bfs = new BFS();
	private final static TestCases testCases = new TestCases();

	@ParameterizedTest
	@MethodSource("testCase")
	void zigzagLevelOrderTest(int testCase) {
		List<List<Integer>> result = bfs.zigzagLevelOrder(testCases.getRoot(testCase));
		assertThat(testCases.isAnswer(testCase, result)).isTrue();
	}

	static Stream<Arguments> testCase() {
		return Stream.of(
			Arguments.of(0),
			Arguments.of(1),
			Arguments.of(2)
		);
	}
}