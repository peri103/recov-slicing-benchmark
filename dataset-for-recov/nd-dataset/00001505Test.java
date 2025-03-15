import org.junit.jupiter.api.Test;

class _00001505Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 750;
        // Block 2:
        int[] L = new int[9];
        for (int i = 0; i < 9; i++) {
            L[i] = 111 * (i + 1);
        }
        // Block 3:
        int ans = 0;
        // Block 4:
        for (int l : L) {
            // Block 5:
            if (N <= l) {
                // Block 6:
                ans = l;
                // Block 7:
                break;
            }
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
    }

