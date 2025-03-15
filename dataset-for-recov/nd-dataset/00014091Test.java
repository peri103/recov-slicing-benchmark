import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        int[] A = {1, 2, 3, 2, 2, 1};
        // Block 3:
        int[][] dp = new int[N][2];
        for (int i = 0; i < N; i++) {
            dp[i][0] = N;
            dp[i][1] = N;
        }
        // Block 4:
        dp[0][0] = 1;
        dp[0][1] = 1;
        // Block 5:
        for (int i = 1; i < A.length; i++) {
            int a = A[i];
            // Block 6:
            int pre_a = A[i - 1];
            // Block 7:
            if (pre_a < a) {
                // Block 8:
                dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1] + 1);
                // Block 9:
                dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1] + 1);
            }
            // Block 10:
            else if (pre_a == a) {
                // Block 11:
                dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1] + 1);
                // Block 12:
                dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);
            }
            // Block 13:
            else {
                // Block 14:
                dp[i][0] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1] + 1);
                // Block 15:
                dp[i][1] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);
            }
        }
        // Block 16:
        System.out.println(Math.min(dp[N - 1][0], dp[N - 1][1]));
        // Block END.
    }
    }
}
