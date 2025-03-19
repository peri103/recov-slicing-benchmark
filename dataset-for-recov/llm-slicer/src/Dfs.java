class Dfs {
    static boolean[][] vis;
    static int[][] grid;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    
    public int dfs(int x, int y, int ex, int ey, int open) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || vis[x][y] || grid[x][y] == -1) {
            return 0;
        }

        if (x == ex && y == ey) {
            return open == 1 ? 1 : 0;
        }
        int ans = 0;
        vis[x][y] = true;
        for (int d = 0; d < 4; ++d) {
            ans += dfs(x + dx[d], y + dy[d], ex, ey, open - 1);
        }
        vis[x][y] = false;
        return ans;
    }
                   
    public int uniquePathsIII(int[][] _grid) {
        grid = _grid;
        int n = grid.length;
        int m = grid[0].length;
        vis = new boolean[n][m];
        int open = 0;
        int sx = -1;
        int sy = -1;
        int ex = -1;
        int ey = -1;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (grid[i][j] == 1) {
                    sx = i;
                    sy = j;
                    grid[i][j] = 0;
                } else if (grid[i][j] == 2) {
                    ex = i;
                    ey = j;
                    grid[i][j] = 0;
                }
                
                if (grid[i][j] == 0) {
                    open++;
                }
            }
        }
        
        return dfs(sx, sy, ex, ey, open);
    }
    public static void main(String[] args) {
        Dfs dfsSolver = new Dfs();
        int[][] grid = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
        };
        
        int result = dfsSolver.uniquePathsIII(grid);
        System.out.println("Unique Paths III: " + result);
    }
}