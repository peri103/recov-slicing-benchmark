import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        java.util.Arrays.sort(a);
        // Block 4:
        int N = a[a.length - 1];
        // Block 5:
        double ans = Double.POSITIVE_INFINITY;
        // Block 6:
        int r = a[0];
        // Block 7:
        for (int i = 0; i < a.length - 1; i++) {
            // Block 8:
            if (ans > Math.abs(a[i] - N / 2.0)) {
                // Block 9:
                ans = Math.abs(a[i] - N / 2.0);
                // Block 10:
                r = a[i];
            }
        }
        // Block 11:
        System.out.println(N + " " + r);
        // Block END.
    }
    }
}
