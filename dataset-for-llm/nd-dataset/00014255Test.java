import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 9;
        // Block 2:
        int[] A = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        // Block 3:
        int i = 0;
        // Block 4:
        int a = 1;
        // Block 5:
        int t = 0;
        // Block 6:
        while (i < N - 1) {
            // Block 7:
            if (A[i] < A[i + 1]) {
                // Block 8:
                if (t == -1) {
                    // Block 9:
                    a += 1;
                    // Block 10:
                    t = 0;
                }
                // Block 11:
                else if (t == 0) {
                    // Block 12:
                    t = 1;
                }
            }
            // Block 13:
            else if (A[i] > A[i + 1]) {
                // Block 14:
                if (t == 1) {
                    // Block 15:
                    a += 1;
                    // Block 16:
                    t = 0;
                }
                // Block 17:
                else if (t == 0) {
                    // Block 18:
                    t = -1;
                }
            }
            // Block 19:
            i++;
        }
        // Block 20:
        System.out.println(a);
        // Block END.
    }
    }
}
