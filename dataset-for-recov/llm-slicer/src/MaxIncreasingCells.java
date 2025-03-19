import java.util.*;

class MaxIncreasingCells {
    public int maxIncreasingCells(int[][] mat) {
        int N = mat.length, M = mat[0].length;
        List<int[]> sort = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sort.add(new int[]{mat[i][j], i, j});
            }
        }
        Collections.sort(sort, ( a, b) -> a[0] - b[0]);
        int[][] dp = new int[N][M];
        int[] row = new int[N], col = new int[M];
        int res = 0;
        for (int i = 0; i < sort.size(); i++) {
            int j = i;
            while (j + 1 < sort.size() && sort.get(j + 1)[0] == sort.get(i)[0]) j++;
            for (int k = i; k <= j; k++) {
                int r = sort.get(k)[1], c = sort.get(k)[2];
                dp[r][c] = Math.max(row[r] + 1, col[c] + 1);
                res = Math.max(res, dp[r][c]);
            }
            for (int k = i; k <= j; k++) {
                int r = sort.get(k)[1], c = sort.get(k)[2];
                row[r] = Math.max(row[r], dp[r][c]);
                col[c] = Math.max(col[c], dp[r][c]);
            }
            i = j;
        }
        return res;
    }
    public static void main(String[] args) {
        MaxIncreasingCells maxIncreasingCells = new MaxIncreasingCells();
        
        int[][] mat = {
            {3, 1, 6},
            {7, 5, 8},
            {9, 2, 4}
        };
        
        int result = maxIncreasingCells.maxIncreasingCells(mat);
        
        System.out.println("Maximum number of increasing cells: " + result);
    }
}