import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {1, 5};
        // Block 3:
        int[] b = {2, 4};
        // Block 4:
        int[] c = {3, 6};
        // Block 5:
        java.util.Arrays.sort(a);
        // Block 6:
        java.util.Arrays.sort(b);
        // Block 7:
        java.util.Arrays.sort(c);
        // Block 8:
        int ans = 0;
        // Block 9:
        int j = 0;
        // Block 10:
        int k = 0;
        // Block 11:
        for (int i = 0; i < n; i++) {
            // Block 12:
            if (j < n) {
                // Block 13:
                while (j < n && a[j] < b[i]) {
                    // Block 14:
                    j++;
                    // Block 15:
                    if (j == n) {
                        // Block 16:
                        break;
                    }
                }
            }
            // Block 17:
            if (k < n) {
                // Block 18:
                while (k < n && c[k] <= b[i]) {
                    // Block 19:
                    k++;
                    // Block 20:
                    if (k == n) {
                        // Block 21:
                        break;
                    }
                }
            }
            // Block 22:
            ans += j * (n - k);
        }
        // Block 23:
        System.out.println(ans);
        // Block END.
    }
    }
}
