import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 3;
        // Block 2:
        int W = 7;
        // Block 3:
        int N = 10;
        // Block 4:
        int K = H;
        // Block 5:
        if (K < W) {
            K = W;
        }
        // Block 6:
        int sum = 0;
        // Block 7:
        int ans = 0;
        // Block 8:
        for (int i = 1; i <= K; i++) {
            // Block 9:
            if (sum < N) {
                // Block 10:
                sum += K;
                // Block 11:
                ans = i;
            }
        }
        // Block 12:
        System.out.println(ans);
        // Block END.
    }
    }
}
