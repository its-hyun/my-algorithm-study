package LeetCode.Number_of_Provinces;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    BFS bfs = new BFS();
    DFS dfs = new DFS();


    @Test
    void findCircleNum() {
        int[][] isConnected1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] isConnected2 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        int expectedAnswer1 = 2;
        int expectedAnswer2 = 3;

        int bfsCase1Result = bfs.findCircleNum(isConnected1);
        int bfsCase2Result = bfs.findCircleNum(isConnected2);
        assertThat(bfsCase1Result).isEqualTo(expectedAnswer1);
        assertThat(bfsCase2Result).isEqualTo(expectedAnswer2);

        int dfsCase1Result = dfs.findCircleNum(isConnected1);
        int dfsCase2Result = dfs.findCircleNum(isConnected2);
        assertThat(dfsCase1Result).isEqualTo(expectedAnswer1);
        assertThat(dfsCase2Result).isEqualTo(expectedAnswer2);
    }
}