import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 4;
        // Block 2:
        int[] a = {1, 1, 1, 1};
        // Block 3:
        int[] b = {1, 1, 1, 1};
        // Block 4:
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            int sumA = 0;
            for (int j = 0; j <= i; j++) {
                sumA += a[j];
            }
            int sumB = 0;
            for (int j = i; j < n; j++) {
                sumB += b[j];
            }
            maxSum = Math.max(maxSum, sumA + sumB);
        }
        System.out.println(maxSum);
        // Block END.
    }
    }

