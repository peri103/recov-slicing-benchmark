import org.junit.jupiter.api.Test;

class _00008729Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1;
        // Block 2:
        int[] a1 = {2};
        // Block 3:
        int[] a2 = {3};
        // Block 4:
        int res = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            int a1_sum = 0;
            for (int j = 0; j <= i; j++) {
                a1_sum += a1[j];
            }
            // Block 7:
            int a2_sum = 0;
            for (int j = i; j < a2.length; j++) {
                a2_sum += a2[j];
            }
            // Block 8:
            res = Math.max(res, a1_sum + a2_sum);
        }
        // Block 9:
        System.out.println(res);
        // Block END.
    }
    }

