import org.junit.jupiter.api.Test;

class _00008672Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 5;
        // Block 2:
        int[] a1 = {3, 2, 2, 4, 1};
        // Block 3:
        int[] a2 = {1, 2, 2, 2, 1};
        // Block 4:
        int res = 0;
        // Block 5:
        int tmp1 = 0;
        // Block 6:
        for (int i = 0; i < n; i++) {
            // Block 7:
            tmp1 += a1[i];
            // Block 8:
            int tmp2 = 0;
            // Block 9:
            for (int j = i; j < n; j++) {
                // Block 10:
                tmp2 += a2[j];
            }
            // Block 11:
            res = Math.max(res, tmp1 + tmp2);
        }
        // Block 12:
        System.out.println(res);
        // Block END.
    }
    }

