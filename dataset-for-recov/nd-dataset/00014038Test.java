import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        int[] A = {1, 2, 3, 2, 2, 1};
        // Block 3:
        int ans = 1;
        // Block 4:
        int flg = 0;
        // Block 5:
        int rev = 0; 
        // Block 6:
        for (int i = 0; i < A.length - 1; i++) {
            int c = A[i];
            int n = A[i + 1];
            // Block 7:
            if (flg == 0) {
                // Block 8:
                if (c < n) {
                    // Block 9:
                    flg = 1;
                // Block 10:
                } else if (c > n) {
                    // Block 11:
                    flg = 1;
                    // Block 12:
                    rev = 1;
                }
            // Block 13:
            } else {
                // Block 14:
                if (rev == 1) {
                    // Block 15:
                    c = -c;
                    // Block 16:
                    n = -n;
                }
                // Block 17:
                if (c > n) {
                    // Block 18:
                    ans += 1;
                    // Block 19:
                    flg = 0;
                    // Block 20:
                    rev = 0;
                }
            }
        }
        // Block 21:
        System.out.println(ans);
        // Block END.
    }
    }

