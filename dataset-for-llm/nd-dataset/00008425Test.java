import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 4;
        // Block 2:
        int[] A = {1, 1, 1, 1};
        // Block 3:
        int[] B = {1, 1, 1, 1};
        // Block 4:
        int max = -1;
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            int sum = 0;
            // Block 7:
            for (int k = 0; k <= i; k++) {
                // Block 8:
                sum += A[k];
            }
            // Block 9:
            for (int k = i; k < N; k++) {
                // Block 10:
                sum += B[k];
            }
            // Block 11:
            if (sum > max) {
                // Block 12:
                max = sum;
            }
        }
        // Block 13:
        System.out.println(max);
        // Block END.
    }
    }
}
