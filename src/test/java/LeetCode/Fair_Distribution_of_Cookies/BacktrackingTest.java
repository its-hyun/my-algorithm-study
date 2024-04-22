package LeetCode.Fair_Distribution_of_Cookies;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BacktrackingTest {

	Backtracking backTracking = new Backtracking();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void distributeCookies(int testCase) {
		int result = backTracking.distributeCookies(testCases.getCookies(testCase), testCases.getK(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}