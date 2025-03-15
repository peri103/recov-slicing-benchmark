import org.junit.jupiter.api.Test;

class _00008597Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1;
        // Block 2:
        int[] a = {2};
        // Block 3:
        int[] b = {3};
        // Block 4:
        int[][] candy = {a, b};
        // Block 5:
        int n_i = 0;
        // Block 6:
        int n_j = 0;
        // Block 7:
        int score = 0;
        // Block 8:
        for (int i = 0; i < n; i++) {
            // Block 9:
            int[] tmp_a = new int[i + 1];
            System.arraycopy(a, 0, tmp_a, 0, i + 1);
            // Block 10:
            int[] tmp_b = new int[b.length - i];
            System.arraycopy(b, i, tmp_b, 0, b.length - i);
            // Block 11:
            int tmp_score = sum(tmp_a) + sum(tmp_b);
            // Block 12:
            score = Math.max(score, tmp_score);
        }
        // Block 13:
        System.out.println(score);
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

