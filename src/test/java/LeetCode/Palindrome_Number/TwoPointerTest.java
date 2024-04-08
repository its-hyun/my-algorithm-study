package LeetCode.Palindrome_Number;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Palindrome Number - Tow Pointer Solution")
class TwoPointerTest {

	TwoPointer twoPointer = new TwoPointer();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void isPalindrome(int testCase) {
		boolean result = twoPointer.isPalindrome(testCases.getX(testCase));
		assertThat(result).isEqualTo(testCases.getAnswer(testCase));
	}
}