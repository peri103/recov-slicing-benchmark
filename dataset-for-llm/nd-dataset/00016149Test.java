import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] a = {100, 0};
        // Block 3:
        Arrays.sort(a);
        // Block 4:
        int ideal = a[a.length - 1] / 2;
        // Block 5:
        int dif_mn = 1000000000;
        // Block 6:
        for (int i = 1; i < n; i++) {
            // Block 7:
            int tmp = a[a.length - 1] - a[i] > ideal ? a[a.length - 1] - a[i] : a[i];
            // Block 8:
            int dif = ideal - tmp;
            // Block 9:
            if (dif < dif_mn) {
                // Block 10:
                int r = a[i];
                // Block 11:
                dif_mn = dif;
            }
        }
        // Block 12:
        System.out.println(a[a.length - 1] + " " + r);
        // Block END.
    }
    }
}
