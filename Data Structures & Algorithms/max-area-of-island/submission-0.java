class Solution {
    public int maxAreaOfIsland(int[][] g) {
        int max = 0;
        for (int i = 0; i < g.length; i++)
            for (int j = 0; j < g[0].length; j++)
                if (g[i][j] == 1)
                    max = Math.max(max, dfs(g, i, j));
        return max;
    }

    int dfs(int[][] g, int i, int j) {
        if (i < 0 || j < 0 || i == g.length || j == g[0].length || g[i][j] == 0)return 0;
        g[i][j] = 0;
        return 1 + dfs(g, i+1, j) + dfs(g, i-1, j)+ dfs(g, i, j+1) + dfs(g, i, j-1);
    }
}