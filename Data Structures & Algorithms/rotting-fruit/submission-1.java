class Solution {
    public int orangesRotting(int[][] g) {
        int r = g.length, c = g[0].length, fresh = 0, time = 0;
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                if(g[i][j] == 2) q.add(new int[]{i, j});
                else if(g[i][j] == 1) fresh++;
        if(fresh == 0) return 0;

        while(!q.isEmpty()) {
            int size = q.size();
            time++;
            while(size-- > 0) {
                int[] p = q.poll();
                int x = p[0], y = p[1];

                if(x+1<r && g[x+1][y]==1){ g[x+1][y]=2; q.add(new int[]{x+1,y}); fresh--; }
                if(x-1>=0 && g[x-1][y]==1){ g[x-1][y]=2; q.add(new int[]{x-1,y}); fresh--; }
                if(y+1<c && g[x][y+1]==1){ g[x][y+1]=2; q.add(new int[]{x,y+1}); fresh--; }
                if(y-1>=0 && g[x][y-1]==1){ g[x][y-1]=2; q.add(new int[]{x,y-1}); fresh--; }
            }
        }
        return fresh==0 ? time-1 : -1;
    }
}