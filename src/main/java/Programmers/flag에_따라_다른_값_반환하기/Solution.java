package Programmers.flag에_따라_다른_값_반환하기;

class Solution {
	public int solution(int a, int b, boolean flag) {
		return flag ? (a + b) : (a - b);
	}
}
