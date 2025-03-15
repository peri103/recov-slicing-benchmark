import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a = {3, 2, 2, 4, 1};
        // Block 3:
        int[] b = {1, 2, 2, 2, 1};
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
            if (ans < (sumA + sumB)) {
                // Block 7:
                ans = (sumA + sumB);
            }
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
    }
}
