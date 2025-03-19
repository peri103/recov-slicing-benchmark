class SellingWood {

	public long sellingWood(int m, int n, int[][] prices) {
		long[][] map = new long[m + 1][n + 1], dp = new long[m + 1][n + 1];
		for (int[] price : prices) {
			map[price[0]][price[1]] = price[2];
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = map[i][j];
				for (int k = 1; k < i; k++) {
					dp[i][j] = Math.max(dp[i][j], dp[k][j] + dp[i - k][j]);
				}
				for (int k = 1; k < j; k++) {
					dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[i][j - k]);
				}
			}
		}
		return dp[m][n];
	}
	    public static void main(String[] args) {
        SellingWood sellingWood = new SellingWood();
        
        int m = 3;
        int n = 5;
        int[][] prices = {
            {1, 4, 2},
            {2, 2, 7},
            {2, 1, 3}
        };
        
        long result = sellingWood.sellingWood(m, n, prices);
        
        System.out.println("Maximum profit from selling wood: " + result);
    }
}