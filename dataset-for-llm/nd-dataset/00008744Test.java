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
        for (int i = 0; i < N; i++) {
            // Block 6:
            ans = Math.max(ans, sum(A, 0, i) + sum(B, i, N) + A[i]);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }

    private static int sum(int[] array, int start, int end) {
        int total = 0;
        for (int i = start; i < end; i++) {
            total += array[i];
        }
        return total;
    }
    }
}
