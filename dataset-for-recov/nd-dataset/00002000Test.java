import org.junit.jupiter.api.Test;

class _00002000Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int ma = Math.min(a, b);
        // Block 3:
        int mi;
        if (a + b <= n) {
            // Block 4:
            mi = 0;
        // Block 5:
        } else {
            // Block 6:
            mi = Math.abs(n - (a + b));
        }
        // Block 7:
        System.out.println(ma + " " + mi);
        // Block END.
    }
    }

