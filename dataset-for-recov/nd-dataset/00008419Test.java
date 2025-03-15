import org.junit.jupiter.api.Test;

class _00008419Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 7;
        // Block 2:
        int[] a_1 = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] a_2 = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        int[] sum_a_1 = new int[n + 1];
        // Block 5:
        int[] sum_a_2 = new int[n + 1];
        // Block 6:
        for (int i = 0; i < n; i++) {
            // Block 7:
            sum_a_1[i + 1] = sum_a_1[i] + a_1[i];
            // Block 8:
            sum_a_2[i + 1] = sum_a_2[i] + a_2[n - i - 1];
        }
        // Block 9:
        int res = 0;
        // Block 10:
        for (int i = 0; i < n; i++) {
            // Block 11:
            res = Math.max(res, sum_a_1[i + 1] + sum_a_2[n - i]);
        }
        // Block 12:
        System.out.println(res);
        // Block END.
    }
    }

