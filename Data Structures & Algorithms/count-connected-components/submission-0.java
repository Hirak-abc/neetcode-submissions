class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());

        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }

        boolean[] v = new boolean[n];
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (!v[i]) {
                dfs(g, v, i);
                c++;
            }
        }
        return c;
    }

    void dfs(List<List<Integer>> g, boolean[] v, int u) {
        v[u] = true;
        for (int x : g.get(u))
            if (!v[x]) dfs(g, v, x);
    }
}