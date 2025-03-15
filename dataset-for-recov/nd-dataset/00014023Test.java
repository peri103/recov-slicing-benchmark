import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        int[] A = {1, 2, 3, 2, 2, 1};
        // Block 3:
        int i = 1;
        // Block 4:
        int ans = 1;
        // Block 5:
        int flg = 0;
        // Block 6:
        for (int index = 0; index < A.length - 1; index++) {
            int current = A[index];
            int next = A[index + 1];
            // Block 7:
            if (current < next) {
                // Block 8:
                if (flg == 0) {
                    // Block 9:
                    flg = 1;
                }
                // Block 10:
                else if (flg == 2) {
                    // Block 11:
                    ans += 1;
                    // Block 12:
                    flg = 0;
                }
            }
            // Block 13:
            if (current > next) {
                // Block 14:
                if (flg == 0) {
                    // Block 15:
                    flg = 2;
                }
                // Block 16:
                else if (flg == 1) {
                    // Block 17:
                    ans += 1;
                    // Block 18:
                    flg = 0;
                }
            }
        }
        // Block 19:
        System.out.println(ans);
        // Block END.
    }
    }
}
