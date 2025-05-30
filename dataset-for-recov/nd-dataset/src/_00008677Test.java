import org.junit.jupiter.api.Test;

class _00008677Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] b = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int sumA = 0;
            for (int j = 0; j <= i; j++) {
                sumA += a[j];
            }
            int sumB = 0;
            for (int j = i; j < n; j++) {
                sumB += b[j];
            }
            ans = Math.max(ans, sumA + sumB);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

