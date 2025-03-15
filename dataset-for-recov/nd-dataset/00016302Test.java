import org.junit.jupiter.api.Test;

class _00016302Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        int nmax = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > nmax) {
                nmax = a[i];
            }
        }
        // Block 4:
        double target = nmax / 2.0;
        // Block 5:
        int cur = a[0] != nmax ? a[0] : a[1];
        // Block 6:
        double curdiff = Math.abs(cur - target);
        // Block 7:
        for (int i = 0; i < n; i++) {
            // Block 8:
            if (a[i] == nmax) {
                // Block 9:
                continue;
            }
            // Block 10:
            double diff = Math.abs(a[i] - target);
            // Block 11:
            if (diff < curdiff) {
                // Block 12:
                curdiff = diff;
                // Block 13:
                cur = a[i];
            }
        }
        // Block 14:
        System.out.println(nmax + " " + cur);
        // Block END.
    }
    }

