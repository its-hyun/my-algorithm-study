package LeetCode.Simplify_Path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointer {
	public String simplifyPath(String path) {
		if (path.length() < 2)
			return "/";

		int start = 0;
		int end = 0;

		List<String> dirs = new ArrayList<>();

		while (end < path.length()) {
			if (end != start && path.charAt(start) == '/' && (path.charAt(end) == '/') || end == path.length() - 1) {
				String dir =
					(end == path.length() - 1) && path.charAt(end) != '/' ? path.substring(start + 1, end + 1) :
						path.substring(start + 1, end);
				if (dir.equals("..") && !dirs.isEmpty()) {
					dirs.remove(dirs.size() - 1);
				} else if (!dir.equals("") && !dir.equals(".") && !dir.equals("..")) {
					dirs.add(dir);
				}

				start = end;
			}
			end++;
		}

		if (dirs.isEmpty()) {
			return "/";
		}

		StringBuilder sb = new StringBuilder();
		for (String dir : dirs) {
			sb.append('/').append(dir);
		}

		return sb.toString();
	}
}


