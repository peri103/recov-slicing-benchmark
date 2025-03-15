class MaxMoves {

	public int maxMoves(int[][] grid) {
		int dp[][] = new int[grid.length][grid[0].length], max = 0;
		for (int i = 1; i < grid[0].length; i++) {
			for (int j = 0; j < grid.length; j++) {
				max = (dp[j][i] = Math.max(j > 0 && grid[j][i] > grid[j - 1][i - 1] ? dp[j - 1][i - 1] + 1 : 0,
						Math.max(j < grid.length - 1 && grid[j][i] > grid[j + 1][i - 1] ? dp[j + 1][i - 1] + 1 : 0,
								grid[j][i] > grid[j][i - 1] ? dp[j][i - 1] + 1 : 0))) == i ? i : max;
			}
		}
		return max;
	}
	public static void main(String[] args) {
        MaxMoves maxMoves = new MaxMoves();
        
        int[][] grid = {
            {3, 4, 5},
            {3, 2, 6},
            {2, 2, 1}
        };
        
        int result = maxMoves.maxMoves(grid);
        
        System.out.println("Maximum number of moves: " + result);
    }
}