package Programmers.베스트앨범;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

class Solution {
	public int[] solution(String[] genres, int[] plays) {
		HashMap<String, Genre> map = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			String key = genres[i];
			Music music = new Music(i, plays[i]);

			map.putIfAbsent(genres[i], new Genre());

			map.get(key).totalPlays += plays[i];
			map.get(key).musicTreeSet.add(music);
		}

		List<Integer> result = new ArrayList<>();
		String[] keys = map.keySet().toArray(new String[0]);
		Arrays.sort(keys, (a, b) -> map.get(b).totalPlays - map.get(a).totalPlays);
		for (String key : keys) {
			TreeSet<Music> tree = map.get(key).musicTreeSet;
			for (int i = 0; i < 2 && !tree.isEmpty(); i++) {
				result.add(tree.pollFirst().index);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	class Genre {
		int totalPlays;
		TreeSet<Music> musicTreeSet;

		public Genre() {
			musicTreeSet = new TreeSet<>((a, b) -> {
				// 조회수가 높은 곡 리턴
				if (a.plays != b.plays) {
					return b.plays - a.plays;
				}
				// 조회수가 같으면 낮은 인덱스 리턴
				return a.index - b.index;
			});
		}
	}

	class Music {
		int index;
		int plays;

		public Music(int index, int plays) {
			this.index = index;
			this.plays = plays;
		}

		@Override
		public String toString() {
			return "index = " + index + ", plays = " + plays;
		}
	}
}
