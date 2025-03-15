import org.junit.jupiter.api.Test;

class _00008633Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int[] A = {3, 2, 2, 4, 1};
        // Block 3:
        int[] B = {1, 2, 2, 2, 1};
        // Block 4:
        for (int i = 1; i < N; i++) {
            A[i] += A[i - 1];
        }
        // Block 5:
        for (int i = N - 2; i >= 0; i--) {
            B[i] += B[i + 1];
        }
        // Block 6:
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, A[i] + B[i]);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

