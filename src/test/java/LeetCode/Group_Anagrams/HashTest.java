package LeetCode.Group_Anagrams;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@DisplayName("Group Anagrams - Hash Solution")
class HashTest {
	private final Hash hash = new Hash();
	private static final TestCases testCases = new TestCases();

	@ParameterizedTest
	@MethodSource("testCase")
	public void groupAnagramsTest(int testCase) {
		List<List<String>> result = hash.groupAnagrams(testCases.getStrs(testCase));
		boolean isAnswer = testCases.isAnswer(testCase, result);
		assertThat(isAnswer).isTrue();
	}

	static Stream<Arguments> testCase() {
		return Stream.of(
			Arguments.of(0),
			Arguments.of(1),
			Arguments.of(2)
		);
	}
}