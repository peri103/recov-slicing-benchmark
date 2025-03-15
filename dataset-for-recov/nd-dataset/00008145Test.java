import org.junit.jupiter.api.Test;

class _00008145Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3, K = 3;
        // Block 2:
        int[] A = {1, 2, 3};
        // Block 3:
        int ans = 0;
        // Block 4:
        int i = 0;
        // Block 5:
        while (true) {
            // Block 6:
            if (i * (K - 1) >= N - 1) {
                // Block 7:
                break;
            }
            // Block 8:
            ans += 1;
            // Block 9:
            i += 1;
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

