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
        double x = a[a.length - 1] / 2.0;
        // Block 5:
        int ans = 0;
        // Block 6:
        double dis = Double.POSITIVE_INFINITY;
        // Block 7:
        for (int i = 0; i < n - 1; i++) {
            // Block 8:
            if (dis > Math.abs(x - a[i])) {
                // Block 9:
                ans = a[i];
                // Block 10:
                dis = Math.abs(x - a[i]);
            }
        }
        // Block 11:
        System.out.println(a[a.length - 1] + " " + ans);
        // Block END.
    }
    }

