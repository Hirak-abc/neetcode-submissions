class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n-1)return false;

        List<Integer>[] g = new ArrayList[n];
        for(int i = 0;i < n;i++)g[i] = new ArrayList<>();

        for (int[] e : edges) {
            g[e[0]].add(e[1]);
            g[e[1]].add(e[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(g,visited,0) == n;
    }

    int dfs(List<Integer>[] g, boolean[] visited, int node) {
        visited[node] = true;
        int count = 1;

        for (int x : g[node]) {
            if (!visited[x]) {
                count += dfs(g, visited, x);
            }
        }
        return count;
    }

}
