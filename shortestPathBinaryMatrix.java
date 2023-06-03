class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) {
            return -1;
        }
        ArrayList<int[]> q = new ArrayList<>();
        int[] next = {0,0};
        q.add(next);
        boolean[][] visit = new boolean[grid.length][grid.length];
        visit[0][0] = true;
        return shortestPathBinaryMatrix(grid, visit, q, 1);
    }

    public int shortestPathBinaryMatrix(int[][] grid, boolean[][] visit, ArrayList<int[]> q, int level) {
        int size = q.size();
        int lev = level+1;
        if(size == 0) {
            return -1;
        }
        for(int x = 0; x < size; x++) {
            int[] node = q.get(0);
            int row = node[0];
            int col = node[1];
            if(row == grid.length -1 && col == grid.length-1) {
                return level;
            }
            for(int i = Math.max(0, row-1); i <= Math.min(row+1, grid.length-1); i++) {
                for(int j = Math.max(0, col-1); j <= Math.min(col+1, grid.length-1); j++) {
                    if(grid[i][j] == 0 && !visit[i][j]) {
                        int[] next = new int[2];
                        next[0] = i; next[1] = j;
                        q.add(next);
                        visit[i][j] = true;
                    }
                }
            }
            q.remove(0);
        }

        return shortestPathBinaryMatrix(grid, visit, q, lev);
    }
}
