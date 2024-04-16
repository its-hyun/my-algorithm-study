package LeetCode.Kth_Largest_Element_in_an_Array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class HeapTest {

	Heap heap = new Heap();
	TestCases testCases = new TestCases();

	@ParameterizedTest
	@ValueSource(ints = {0, 1})
	void findKthLargest(int testCase) {
		int result = heap.findKthLargest(testCases.getNums(testCase), testCases.getK(testCase));
		assertThat(result).isEqualTo(testCases.getExpectedAnswer(testCase));
	}
}