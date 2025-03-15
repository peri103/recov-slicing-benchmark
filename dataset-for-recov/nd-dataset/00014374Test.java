import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 9;
        // Block 2:
        int[] A = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        // Block 3:
        int last = 0;
        // Block 4:
        int ans = 1;
        // Block 5:
        for (int i = 0; i < N - 1; i++) {
            // Block 6:
            int diff = A[i] - A[i + 1];
            // Block 7:
            if (last == 0) {
                // Block 8:
                if (diff > 0) {
                    // Block 9:
                    last = 1;
                }
                // Block 10:
                else if (diff < 0) {
                    // Block 11:
                    last = -1;
                }
            }
            // Block 12:
            else if (last * diff < 0) {
                // Block 13:
                ans += 1;
                // Block 14:
                last = 0;
            }
        }
        // Block 15:
        System.out.println(ans);
        // Block END.
    }
    }
}
