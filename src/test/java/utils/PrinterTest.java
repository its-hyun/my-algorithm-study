package utils;

import static utils.Printer.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("출력 함수 테스트")
class PrinterTest {

	@Test()
	@DisplayName("2차원 배열(int[][]) 출력 테스트")
	public void printInt2DArrayTest() {
		int[][] exampleArray = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		print2DArray(exampleArray);
	}

	@Test()
	@DisplayName("2차원 배열(boolean[][]) 출력 테스트")
	public void printBoolean2DArrayTest() {
		boolean[][] exampleArray = {
			{true, false, true},
			{false, true, false},
			{true, true, true}
		};
		print2DArray(exampleArray);
	}
}