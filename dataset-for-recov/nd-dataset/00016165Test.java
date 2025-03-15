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
        int amax = a[a.length - 1];
        // Block 5:
        double tmp1 = amax + 1;
        // Block 6:
        for (int i : java.util.Arrays.copyOfRange(a, 0, n - 1)) {
            // Block 7:
            double tmp2 = i - amax / 2.0;
            // Block 8:
            if (tmp2 > tmp1) {
                // Block 9:
                break;
            }
            // Block 10:
            else {
                // Block 11:
                int r = i;
                // Block 12:
                tmp1 = Math.abs(tmp2);
            }
        }
        // Block 13:
        System.out.println(amax + " " + r);
        // Block END.
    }
    }

