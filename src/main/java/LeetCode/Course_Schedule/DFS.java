package LeetCode.Course_Schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DFS {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length == 1) {
            return true;
        }

        int[] checked = new int[numCourses];
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            if (!hashMap.containsKey(prerequisite[0])) {
                hashMap.put(prerequisite[0], new ArrayList<>());
            }
            hashMap.get(prerequisite[0]).add(prerequisite[1]);
        }

        for (int[] prerequisite : prerequisites) {
            int schedule = prerequisite[0];
            if (checked[schedule] == 0) {
                if (isCircular(hashMap, checked, schedule)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isCircular(HashMap<Integer, List<Integer>> hashMap, int[] checked, int schedule) {

        // 1 == visited
        if (checked[schedule] == 1) {
            return true;
        }

        // 2 == not circular
        if (checked[schedule] == 2) {
            return false;
        }

        checked[schedule] = 1;
        if (hashMap.containsKey(schedule)) {
            for (int i : hashMap.get(schedule)) {
                if (isCircular(hashMap, checked, i)) {
                    return true;
                }
            }
        }

        checked[schedule] = 2;
        return false;
    }
}
