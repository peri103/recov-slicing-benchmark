import org.junit.jupiter.api.Test;

class _00008368Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int[] A = {3, 2, 2, 4, 1};
        // Block 3:
        int[] B = {1, 2, 2, 2, 1};
        // Block 4:
        int ma = 0;
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            int c = 0;
            for (int j = 0; j <= i; j++) {
                c += A[j];
            }
            for (int j = i; j < N; j++) {
                c += B[j];
            }
            // Block 7:
            ma = Math.max(ma, c);
        }
        // Block 8:
        System.out.println(ma);
        // Block END.
    }
    }

