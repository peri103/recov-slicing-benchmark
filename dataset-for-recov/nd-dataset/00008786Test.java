import org.junit.jupiter.api.Test;

class _00008786Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] A1 = {3, 2, 2, 4, 1};
        // Block 3:
        int[] A2 = {1, 2, 2, 2, 1};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int x = 0;
            for (int j = 0; j <= i; j++) {
                x += A1[j];
            }
            for (int j = i; j < n; j++) {
                x += A2[j];
            }
            // Block 7:
            if (ans < x) {
                // Block 8:
                ans = x;
            }
        }
        // Block 9:
        System.out.println(ans);
        // Block END.
    }
    }

