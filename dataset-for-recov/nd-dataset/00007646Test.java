import org.junit.jupiter.api.Test;

class _00007646Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 20, n = 3;
        // Block 2:
        int[] a = {4, 5, 6};
        // Block 3:
        for (int i = 0; i < n; i++) {
            // Block 4:
            h -= a[i];
        }
        // Block 5:
        System.out.println(h <= 0 ? "Yes" : "No");
        // Block END.
    }
    }

