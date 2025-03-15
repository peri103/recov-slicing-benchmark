import org.junit.jupiter.api.Test;

class _00014371Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 9;
        // Block 2:
        int[] a = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        // Block 3:
        int ans = 1;
        // Block 4:
        int m = 0;
        // Block 5:
        for (int i = 1; i < n; i++) {
            // Block 6:
            if ((a[i] - a[i - 1]) * m < 0) {
                // Block 7:
                ans += 1;
                // Block 8:
                m = 0;
            }
            // Block 9:
            else if (a[i] - a[i - 1] != 0) {
                // Block 10:
                m = a[i] - a[i - 1];
            }
        }
        // Block 11:
        System.out.println(ans);
        // Block END.
    }
    }

