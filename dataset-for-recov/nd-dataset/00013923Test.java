import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        int[] a = {1, 2, 3, 2, 2, 1};
        // Block 3:
        int ans = 1;
        // Block 4:
        if (n == 1) {
            // Block 5:
            System.out.println(ans);
            // Block 6:
            System.exit(0);
        }
        // Block 7:
        int c = 0;
        // Block 8:
        for (int i = 0; i < n; i++) {
            // Block 9:
            if (i != n - 1) {
                // Block 10:
                if (c == 1) {
                    // Block 11:
                    if (a[i + 1] < a[i]) {
                        // Block 12:
                        ans += 1;
                        // Block 13:
                        c = 0;
                        // Block 14:
                        continue;
                    }
                }
                // Block 15:
                else if (c == 2) {
                    // Block 16:
                    if (a[i + 1] > a[i]) {
                        // Block 17:
                        ans += 1;
                        // Block 18:
                        c = 0;
                        // Block 19:
                        continue;
                    }
                }
                // Block 20:
                if (a[i + 1] > a[i]) {
                    // Block 21:
                    c = 1;
                }
                // Block 22:
                else if (a[i + 1] < a[i]) {
                    // Block 23:
                    c = 2;
                }
            }
        }
        // Block 24:
        System.out.println(ans);
        // Block END.
    }
    }
}
