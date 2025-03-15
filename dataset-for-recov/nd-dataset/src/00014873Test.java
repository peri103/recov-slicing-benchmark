import org.junit.jupiter.api.Test;

class _00014873Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 2, P = 0;
        // Block 2:
        int[] A = {1, 3};
        // Block 3:
        int[][] dp = new int[N + 1][2];
        // Block 4:
        dp[0][0] = 1;
        // Block 5:
        for (int k = 0; k < N; k++) {
            // Block 6:
            if (A[k] % 2 == 0) {
                // Block 7:
                dp[k + 1][0] = dp[k][0] * 2;
                // Block 8:
                dp[k + 1][1] = dp[k][1] * 2;
            }
            // Block 9:
            else {
                // Block 10:
                dp[k + 1][0] = dp[k][0] + dp[k][1];
                // Block 11:
                dp[k + 1][1] = dp[k][1] + dp[k][0];
            }
        }
        // Block 12:
        System.out.println(dp[N][P]);
        // Block END.
    }
    }

