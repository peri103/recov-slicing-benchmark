import org.junit.jupiter.api.Test;

class _00014497Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 9;
        // Block 2:
        int[] l = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        // Block 3:
        int ans = 0;
        // Block 4:
        int now = 0;
        // Block 5:
        int m = 0;
        // Block 6:
        int c = 0;
        // Block 7:
        for (int i : l) {
            // Block 8:
            if (now == 0) {
                // Block 9:
                now = i;
            }
            // Block 10:
            else {
                // Block 11:
                if (m == 0) {
                    // Block 12:
                    if (now < i) {
                        // Block 13:
                        m = 1;
                    }
                    // Block 14:
                    else if (now > i) {
                        // Block 15:
                        m = -1;
                    }
                }
                // Block 16:
                else if (m == 1) {
                    // Block 17:
                    if (now > i) {
                        // Block 18:
                        ans += 1;
                        // Block 19:
                        m = 0;
                    }
                }
                // Block 20:
                else {
                    // Block 21:
                    if (now < i) {
                        // Block 22:
                        ans += 1;
                        // Block 23:
                        m = 0;
                    }
                }
                // Block 24:
                now = i;
            }
        }
        // Block 25:
        System.out.println(ans + 1);
        // Block END.
    }
    }

