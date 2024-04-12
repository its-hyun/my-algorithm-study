package LeetCode.Two_Sum;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class HashTableTest {

	HashTable hashTable = new HashTable();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1, 2})
	void twoSum(int testCase) {
		int[] result = hashTable.twoSum(testCases.getNums(testCase), testCases.getTarget(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}