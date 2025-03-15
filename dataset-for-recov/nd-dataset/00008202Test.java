import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 8, K = 3;
        // Block 2:
        int[] A = {7, 3, 1, 8, 4, 6, 2, 5};
        // Block 3:
        int ans = 0;
        // Block 4:
        while (true) {
            // Block 5:
            if (N > K) {
                // Block 6:
                N -= (K - 1);
                // Block 7:
                ans += 1;
            // Block 8:
            } else {
                // Block 9:
                ans += 1;
                // Block 10:
                break;
            }
        }
        // Block 11:
        System.out.println(ans);
        // Block END.
    }
    }
}
