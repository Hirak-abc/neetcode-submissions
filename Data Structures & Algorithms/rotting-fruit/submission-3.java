class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if(grid[i][j] == 1) {
                    count_fresh++;
                }
            }
        }

        if(count_fresh == 0) return 0;

        int count = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            count++;

            for(int i = 0; i < size; i++) {
                int[] point = queue.poll();
                int x = point[0], y = point[1];

                if(x + 1 < rows && grid[x+1][y] == 1) {
                    grid[x+1][y] = 2;
                    queue.offer(new int[]{x+1, y});
                    count_fresh--;
                }

                if(x - 1 >= 0 && grid[x-1][y] == 1) {
                    grid[x-1][y] = 2;
                    queue.offer(new int[]{x-1, y});
                    count_fresh--;
                }

                if(y + 1 < cols && grid[x][y+1] == 1) {
                    grid[x][y+1] = 2;
                    queue.offer(new int[]{x, y+1});
                    count_fresh--;
                }

                if(y - 1 >= 0 && grid[x][y-1] == 1) {
                    grid[x][y-1] = 2;
                    queue.offer(new int[]{x, y-1});
                    count_fresh--;
                }
            }
        }

        return count_fresh == 0 ? count - 1 : -1;
    }
}