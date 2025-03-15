class Main {
    public static void main(String[] args) {
        // Block 1:
        int n = 4;
        // Block 2:
        int[][] dp = new int[2][n];
        // Block 3:
        int[] a1 = {1, 1, 1, 1};
        // Block 4:
        int[] a2 = {1, 1, 1, 1};
        // Block 5:
        dp[0][0] = a1[0];
        // Block 6:
        for (int i = 1; i < n; i++) {
            // Block 7:
            dp[0][i] = dp[0][i - 1] + a1[i];
        }
        // Block 8:
        dp[1][0] = dp[0][0] + a2[0];
        // Block 9:
        for (int i = 1; i < n; i++) {
            // Block 10:
            dp[1][i] = Math.max(dp[0][i] + a2[i], dp[1][i - 1] + a2[i]);
        }
        // Block 11:
        System.out.println(dp[1][n - 1]);
        // Block END.
    }
}
