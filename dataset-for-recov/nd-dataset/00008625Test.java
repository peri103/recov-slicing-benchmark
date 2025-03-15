import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 1;
        // Block 2:
        int[] A = {2};
        // Block 3:
        int[] B = {3};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int x = 0; x < N; x++) {
            // Block 6:
            int[] C = new int[x + 1 + (N - x)];
            System.arraycopy(A, 0, C, 0, x + 1);
            System.arraycopy(B, x, C, x + 1, N - x);
            // Block 7:
            int n = 0;
            for (int value : C) {
                n += value;
            }
            // Block 8:
            ans = Math.max(ans, n);
        }
        // Block 9:
        System.out.println(ans);
        // Block END.
    }
    }
}
