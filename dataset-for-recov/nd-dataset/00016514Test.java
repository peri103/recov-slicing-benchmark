import org.junit.jupiter.api.Test;

class _00016514Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        java.util.Arrays.sort(a);
        // Block 4:
        int ma = a[a.length - 1];
        // Block 5:
        double mn = Double.POSITIVE_INFINITY;
        // Block 6:
        int mni = -1;
        // Block 7:
        for (int i = 0; i < n - 1; i++) {
            // Block 8:
            if (Math.abs(2 * a[i] - ma) < mn) {
                // Block 9:
                mn = Math.abs(2 * a[i] - ma);
                // Block 10:
                mni = i;
            }
        }
        // Block 11:
        System.out.println(ma + " " + a[mni]);
        // Block END.
    }
    }

