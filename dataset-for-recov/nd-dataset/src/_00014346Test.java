import org.junit.jupiter.api.Test;

class _00014346Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 7;
        // Block 2:
        if (N == 1) {
            System.out.println(1);
            System.exit(0);
        }
        // Block 3:
        int[] A = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 4:
        int ans = 1;
        // Block 5:
        int cur = A[0];
        // Block 6:
        boolean Decided = A[0] != A[1];
        // Block 7:
        boolean Flat = A[0] == A[1];
        // Block 8:
        boolean Up = A[0] < A[1];
        // Block 9:
        for (int n = 1; n < N; n++) {
            // Block 10:
            if (Decided) {
                // Block 11:
                if (A[n] == cur) {
                    // Block 12:
                    continue;
                }
                // Block 13:
                if ((A[n] >= cur) == Up) {
                    // Block 14:
                    cur = A[n];
                } 
                // Block 15:
                else {
                    // Block 16:
                    cur = A[n];
                    // Block 17:
                    Up = !Up;
                    // Block 18:
                    Decided = false;
                    // Block 19:
                    ans += 1;
                }
            }
            // Block 20:
            else {
                // Block 21:
                if (A[n] != cur) {
                    // Block 22:
                    Up = A[n] > cur;
                    // Block 23:
                    cur = A[n];
                    // Block 24:
                    Decided = true;
                }
            }
        }
        // Block 25:
        System.out.println(ans);
        // Block END.
    }
    }

