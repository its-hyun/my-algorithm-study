package Programmers.단어_변환;

public class DFS {

	public static void main(String[] args) {
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
		String begin = "hit";
		String target = "cog";
		DFS DFS = new DFS();
		System.out.println("result = " + DFS.solution(begin, target, words));
	}

	public int solution(String begin, String target, String[] words) {
		boolean[] visited = new boolean[words.length];
		int result = findWord(visited, words, begin, target, 0, 0);
		return result == Integer.MAX_VALUE ? 0 : result;
	}

	private int findWord(boolean[] visited, String[] words, String word, String target, int i, int depth) {

		if (word.equals(target)) {
			return depth;
		}

		if (i >= words.length) {
			return Integer.MAX_VALUE;
		}

		int include = Integer.MAX_VALUE;
		if (!visited[i] && isChangeable(words[i], word)) {
			visited[i] = true;
			include = findWord(visited, words, words[i], target, 0, depth + 1);
			visited[i] = false;
		}

		int exclude = findWord(visited, words, word, target, i + 1, depth);

		return Math.min(include, exclude);
	}

	// 하나의 알파뱃만 다른지 체크하는 로직
	private boolean isChangeable(String a, String b) {
		int diff = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				diff += 1;
			}
		}
		return diff <= 1;
	}
}
