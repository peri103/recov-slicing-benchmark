import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3, P = 0;
        // Block 2:
        int[] a_ls = {1, 1, 1};
        // Block 3:
        int[][] dp = new int[N + 1][2];
        // Block 4:
        dp[0][0] = 1;
        // Block 5:
        for (int i = 1; i <= N; i++) {
            // Block 6:
            int next = a_ls[i - 1] % 2;
            // Block 7:
            if (next == 0) {
                // Block 8:
                dp[i][0] += 2 * dp[i - 1][0];
                // Block 9:
                dp[i][1] += 2 * dp[i - 1][1];
            }
            // Block 10:
            else {
                // Block 11:
                dp[i][0] += dp[i - 1][0] + dp[i - 1][1];
                // Block 12:
                dp[i][1] += dp[i - 1][0] + dp[i - 1][1];
            }
        }
        // Block 13:
        System.out.println(dp[N][P]);
        // Block END.
    }
    }

