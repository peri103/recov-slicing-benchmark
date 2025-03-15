import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1;
        // Block 2:
        int[] a1 = {2};
        // Block 3:
        int[] a2 = {3};
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int top = 0;
            for (int j = 0; j <= i; j++) {
                top += a1[j];
            }
            // Block 7:
            int bottom = 0;
            for (int j = i; j < a2.length; j++) {
                bottom += a2[j];
            }
            // Block 8:
            int tmp = top + bottom;
            // Block 9:
            ans = Math.max(tmp, ans);
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

