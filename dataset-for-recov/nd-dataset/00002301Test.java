import org.junit.jupiter.api.Test;

class _00002301Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int ma = Math.min(a, b);
        // Block 3:
        int mi;
        if (a + b - n < 0) {
            // Block 4:
            mi = 0;
        // Block 5:
        } else {
            // Block 6:
            mi = a + b - n;
        }
        // Block 7:
        System.out.println(ma + " " + mi);
        // Block END.
    }
    }

