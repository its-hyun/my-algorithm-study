package LeetCode.Majority_Element;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class MooreVoteAlgorithmTest {

	MooreVoteAlgorithm mooreVoteAlgorithm = new MooreVoteAlgorithm();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1})
	void majorityElement(int testCase) {
		int result = mooreVoteAlgorithm.majorityElement(testCases.getNums(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}