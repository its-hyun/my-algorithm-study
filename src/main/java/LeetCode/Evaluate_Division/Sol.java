package LeetCode.Evaluate_Division;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Sol {

	public static void main(String[] args) {
		List<List<String>> equations = new ArrayList<>();
		equations.add(new ArrayList(Arrays.asList("a", "b")));
		equations.add(new ArrayList(Arrays.asList("b", "c")));

		double[] values = {2.0, 3.0};

		List<List<String>> queries = new ArrayList<>();
		queries.add(new ArrayList(Arrays.asList("a", "c")));
		queries.add(new ArrayList(Arrays.asList("b", "a")));
		queries.add(new ArrayList(Arrays.asList("a", "e")));
		queries.add(new ArrayList(Arrays.asList("a", "a")));
		queries.add(new ArrayList(Arrays.asList("x", "x")));

		Sol sol = new Sol();
		double[] doubles = sol.calcEquation(equations, values, queries);
		System.out.println(Arrays.toString(doubles));
	}

	public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

		HashMap<String, HashMap<String, Double>> map = new HashMap<>();
		for (int i = 0; i < equations.size(); i++) {
			String src = equations.get(i).get(0);
			String dst = equations.get(i).get(1);

			map.putIfAbsent(src, new HashMap<>());
			map.putIfAbsent(dst, new HashMap<>());
			map.get(src).putIfAbsent(dst, values[i]);
			map.get(dst).putIfAbsent(src, 1 / values[i]);
			map.get(src).putIfAbsent(src, 1.0);
			map.get(dst).putIfAbsent(dst, 1.0);
		}

		// `map`의 모든 값 출력
		for (Map.Entry<String, HashMap<String, Double>> entry : map.entrySet()) {
			String key = entry.getKey();
			HashMap<String, Double> innerMap = entry.getValue();
			System.out.println("Key: " + key);
			for (Map.Entry<String, Double> innerEntry : innerMap.entrySet()) {
				System.out.println("    Inner Key: " + innerEntry.getKey() + ", Value: " + innerEntry.getValue());
			}
		}

		double[] ans = new double[queries.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = findEquation(map, queries.get(i).get(0), queries.get(i).get(1));
		}

		return ans;
	}

	public double findEquation(HashMap<String, HashMap<String, Double>> map, String src, String dst) {
		if (!map.containsKey(src) || !map.containsKey(dst)) {
			return -1;
		}

		if (src.equals(dst)) {
			return 1;
		}

		// bfs
		HashMap<String, Boolean> visited = new HashMap<>();
		visited.put(src, true);
		LinkedList<keyAndValue> q = new LinkedList<>();
		q.add(new keyAndValue(src, 1.0));
		while (!q.isEmpty()) {
			keyAndValue node = q.poll();
			String key = node.key;
			Double value = node.value;

			for (Map.Entry<String, Double> entry : map.get(key).entrySet()) {
				String entryKey = entry.getKey();
				if (visited.containsKey(entryKey)) {
					continue;
				}

				if (entryKey.equals(dst)) {
					return value * entry.getValue();
				}
				visited.put(entryKey, true);
				q.add(new keyAndValue(entryKey, value * entry.getValue()));
			}
		}

		return -1;
	}

	private class keyAndValue {
		public String key;
		public Double value;

		public keyAndValue(String key, Double value) {
			this.key = key;
			this.value = value;
		}
	}
}
