import org.junit.jupiter.api.Test;

class _00016194Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a = {6, 9, 4, 2, 11};
        // Block 3:
        java.util.Arrays.sort(a);
        // Block 4:
        int M = a[a.length - 1];
        // Block 5:
        int m = a[0];
        // Block 6:
        int C = -1;
        // Block 7:
        for (int i = 0; i < n; i++) {
            // Block 8:
            int c = a[i] * (M - a[i]);
            // Block 9:
            if (C < c) {
                // Block 10:
                C = c;
                // Block 11:
                m = a[i];
            // Block 12:
            } else {
                // Block 13:
                break;
            }
        }
        // Block 14:
        System.out.println(M + " " + m);
        // Block END.
    }
    }

