import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int[] A = {3, 2, 2, 4, 1};
        // Block 3:
        int[] B = {1, 2, 2, 2, 1};
        // Block 4:
        int maxSum = Integer.MIN_VALUE;
        for (int n = 0; n < N; n++) {
            int currentSum = 0;
            for (int i = 0; i <= n; i++) {
                currentSum += A[i];
            }
            for (int i = n; i < N; i++) {
                currentSum += B[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
        // Block END.
    }
    }

