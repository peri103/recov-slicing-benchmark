import org.junit.jupiter.api.Test;

class _00007008Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 20, n = 3;
        // Block 2:
        int[] a = {4, 5, 6};
        // Block 3:
        int x = 0;
        // Block 4:
        for (int i = 0; i < n; i++) {
            // Block 5:
            x = x + a[i];
        }
        // Block 6:
        System.out.println(x >= h ? "Yes" : "No");
        // Block END.
    }
    }

