class Largest1BorderedSquare {
    public int largest1BorderedSquare(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][][] hl = new boolean[n][m][m];
        boolean[][][] vl = new boolean[n][n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]==0)
                    continue;
                hl[i][j][j] = true;
                vl[i][i][j] = true;
                for (int k = j+1; k < m; ++k) {
                    if (grid[i][k] == 0)
                        break;
                    hl[i][j][k] = true;
                }
                for (int k = i+1; k < n; ++k) {
                    if (grid[k][j] == 0)
                        break;
                    vl[i][k][j] = true;
                }
            }
        }
        int ans = 0;
        for (int a = 0; a < n; ++a) {
            for (int b = 0; b < m; ++b) {
                if (grid[a][b]==0)
                    continue;
                ans = Math.max(ans, 1);
                for (int c = 1; a+c<n&&b+c<m; ++c) {
                    if (!hl[a][b][b+c]||!vl[a][a+c][b])
                        break;
                    if (hl[a+c][b][b+c]&&vl[a][a+c][b+c]) {
                        ans = Math.max(ans, (c+1)*(c+1));
                    }
                }
            }
        }
        return ans;
    }
     public static void main(String[] args) {
        Largest1BorderedSquare largest1BorderedSquare = new Largest1BorderedSquare();
        int[][] grid = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        
        int result = largest1BorderedSquare.largest1BorderedSquare(grid);
        
        System.out.println("The area of the largest 1-bordered square is: " + result);
    }
}