package LeetCode.Binary_Tree_Level_Order_Traversal;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Binary Tree Level Order Traversal - Recursion Solution")
class RecursionTest {

	private final Recursion recursion = new Recursion();
	private final static TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void levelOrder(int testCase) {
		List<List<Integer>> result = recursion.levelOrder(testCases.getRoot(testCase));
		assertThat(testCases.isAnswer(testCase, result)).isTrue();
	}
}