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
        int ans = sum(a1) + a2[n - 1];
        // Block 5:
        int sum_a = ans;
        // Block 6:
        for (int i = 0; i < n - 1; i++) {
            // Block 7:
            sum_a = sum_a - a1[n - 1 - i] + a2[n - 2 - i];
            // Block 8:
            ans = Math.max(ans, sum_a);
        }
        // Block 9:
        System.out.println(ans);
        // Block END.
    }

    private static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }
    }

