import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] A = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        int ans = 1;
        // Block 4:
        int d = 0;
        // Block 5:
        for (int i = 1; i < n; i++) {
            // Block 6:
            int diff = A[i] - A[i - 1];
            // Block 7:
            if (d == 0) {
                // Block 8:
                d = diff;
            }
            // Block 9:
            else if (d * diff < 0) {
                // Block 10:
                d = 0;
                // Block 11:
                ans += 1;
            }
        }
        // Block 12:
        System.out.println(ans);
        // Block END.
    }
    }
}
