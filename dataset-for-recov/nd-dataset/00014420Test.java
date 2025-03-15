import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        boolean up = false;
        // Block 4:
        boolean down = false;
        // Block 5:
        int ans = 1;
        // Block 6:
        for (int i = 1; i < n; i++) {
            // Block 7:
            if (up) {
                // Block 8:
                if (a[i] < a[i - 1]) {
                    // Block 9:
                    ans += 1;
                    // Block 10:
                    up = false;
                }
            // Block 11:
            } else if (down) {
                // Block 12:
                if (a[i] > a[i - 1]) {
                    // Block 13:
                    ans += 1;
                    // Block 14:
                    down = false;
                }
            // Block 15:
            } else {
                // Block 16:
                if (a[i] > a[i - 1]) {
                    // Block 17:
                    up = true;
                // Block 18:
                } else if (a[i] < a[i - 1]) {
                    // Block 19:
                    down = true;
                }
            }
        }
        // Block 20:
        System.out.println(ans);
        // Block END.
    }
    }

