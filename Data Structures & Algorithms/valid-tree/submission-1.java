class Solution {
    public boolean validTree(int n, int[][] e) {
        if (e.length != n - 1) return false;

        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());

        for (int[] x : e) {
            g.get(x[0]).add(x[1]);
            g.get(x[1]).add(x[0]);
        }

        boolean[] v = new boolean[n];
        return dfs(g, v, 0) == n;
    }

    int dfs(List<List<Integer>> g, boolean[] v, int u) {
        v[u] = true;
        int c = 1;
        for (int x : g.get(u))
            if (!v[x]) c += dfs(g, v, x);
        return c;
    }
}