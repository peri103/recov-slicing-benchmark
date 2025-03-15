import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 6;
        // Block 2:
        int[] a = {1, 2, 3, 2, 2, 1};
        // Block 3:
        int cnt = 1;
        // Block 4:
        int dr = 0;
        // Block 5:
        int sav = a[0];
        // Block 6:
        for (int i = 1; i < n; i++) {
            // Block 7:
            if (dr == 0) {
                // Block 8:
                if (sav < a[i]) {
                    // Block 9:
                    dr = 1;
                }
                // Block 10:
                else if (sav > a[i]) {
                    // Block 11:
                    dr = -1;
                }
            }
            // Block 12:
            else if (dr == 1) {
                // Block 13:
                if (sav > a[i]) {
                    // Block 14:
                    cnt = cnt + 1;
                    // Block 15:
                    dr = 0;
                }
            }
            // Block 16:
            else if (dr == -1) {
                // Block 17:
                if (sav < a[i]) {
                    // Block 18:
                    cnt = cnt + 1;
                    // Block 19:
                    dr = 0;
                }
            }
            // Block 20:
            sav = a[i];
        }
        // Block 21:
        int ans = cnt;
        // Block 22:
        System.out.println(ans);
        // Block END.
    }
    }
}
