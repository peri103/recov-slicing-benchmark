import org.junit.jupiter.api.Test;

class _00014492Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 7;
        // Block 2:
        int[] A = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        int ans;
        if (N <= 2) {
            // Block 4:
            ans = 1;
        } else {
            // Block 5:
            ans = 1;
            // Block 6:
            int count = (A[0] < A[1]) ? 1 : (A[0] > A[1]) ? -1 : 0;
            // Block 7:
            int i = 2;
            // Block 8:
            while (i < N) {
                // Block 9:
                if (count * ((A[i - 1] < A[i]) ? 1 : (A[i - 1] > A[i]) ? -1 : 0) < 0) {
                    // Block 10:
                    ans += 1;
                    // Block 11:
                    count = 0;
                }
                // Block 12:
                else {
                    // Block 13:
                    if (count == 0) {
                        // Block 14:
                        count = (A[i - 1] < A[i]) ? 1 : (A[i - 1] > A[i]) ? -1 : 0;
                    }
                }
                // Block 15:
                i += 1;
            }
        }
        // Block 17:
        System.out.println(ans);
        // Block END.
    }
    }

