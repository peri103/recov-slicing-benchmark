import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a = {1, 2, 3, 2, 1, 999999999, 1000000000};
        // Block 3:
        int ans = 1;
        // Block 4:
        boolean u = false;
        // Block 5:
        boolean d = false;
        // Block 6:
        for (int i = 1; i < n; i++) {
            // Block 7:
            if (u) {
                // Block 8:
                if (a[i] < a[i - 1]) {
                    // Block 9:
                    u = false;
                    // Block 10:
                    ans += 1;
                }
            // Block 11:
            } else if (d) {
                // Block 12:
                if (a[i] > a[i - 1]) {
                    // Block 13:
                    d = false;
                    // Block 14:
                    ans += 1;
                }
            // Block 15:
            } else {
                // Block 16:
                if (a[i] > a[i - 1]) {
                    // Block 17:
                    u = true;
                // Block 18:
                } else if (a[i] < a[i - 1]) {
                    // Block 19:
                    d = true;
                }
            }
        }
        // Block 20:
        System.out.println(ans);
        // Block END.
    }
    }
}
