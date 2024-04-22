package LeetCode.Beautiful_Arrangement;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BacktrackingTest {

	Backtracking backtracking = new Backtracking();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void countArrangement(int testCase) {
		int result = backtracking.countArrangement(testCases.getN(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}