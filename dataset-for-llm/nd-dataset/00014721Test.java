import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1, p = 1;
        // Block 2:
        int[] a = {50};
        // Block 3:
        int[] d = {0, 0};
        // Block 4:
        for (int i = 0; i < n; i++) {
            // Block 5:
            d[a[i] % 2]++;
        }
        // Block 6:
        long q = (long) Math.pow(2, d[0]);
        // Block 7:
        long ans = 0;
        // Block 8:
        int m = d[1];
        // Block 9:
        long[] f = new long[m + 1];
        f[0] = 1; // f[0] is 1
        // Block 10:
        for (int i = 1; i <= m; i++) {
            // Block 11:
            f[i] = f[i - 1] * i;
        }
        // Block 12:
        for (int i = 0; i <= m; i++) {
            // Block 13:
            if (i % 2 != p) continue;
            // Block 14:
            ans += q * f[m] / f[i] / f[m - i];
        }
        // Block 15:
        System.out.println(ans);
        // Block END.
    }
    }
}
