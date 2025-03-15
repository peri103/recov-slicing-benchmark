import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a1 = {3, 2, 2, 4, 1};
        // Block 3:
        int[] a2 = {1, 2, 2, 2, 1};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int sumA1 = 0;
            for (int j = 0; j <= i; j++) {
                sumA1 += a1[j];
            }
            int sumA2 = 0;
            for (int j = i; j < n; j++) {
                sumA2 += a2[j];
            }
            ans = Math.max(ans, sumA1 + sumA2);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }
}
