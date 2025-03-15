import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] A = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] B = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int sumA = 0;
            for (int j = 0; j <= i; j++) {
                sumA += A[j];
            }
            int sumB = 0;
            for (int j = i; j < n; j++) {
                sumB += B[j];
            }
            ans = Math.max(sumA + sumB, ans);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

