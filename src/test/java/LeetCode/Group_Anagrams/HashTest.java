package LeetCode.Group_Anagrams;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HashTest {
	private final Hash hash = new Hash();
	private static final TestCases testCases = new TestCases();

	@ParameterizedTest
	@MethodSource("testCase")
	public void test(int testCase, int expectedAnswer) {
		List<List<String>> result = hash.groupAnagrams(testCases.getStrs(testCase));
		boolean isAnswer = testCases.isAnswer(expectedAnswer, result);
		assertThat(isAnswer).isTrue();
	}

	static Stream<Arguments> testCase() {
		return Stream.of(
			Arguments.of(0, 0),
			Arguments.of(1, 1),
			Arguments.of(2, 2)
		);
	}
}