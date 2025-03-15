import org.junit.jupiter.api.Test;

class _00018709Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 3;
        // Block 2:
        int w = 7;
        // Block 3:
        int n = 10;
        // Block 4:
        if (n % Math.max(h, w) == 0) {
            // Block 5:
            System.out.println(n / Math.max(h, w));
        } else {
            // Block 6:
            System.out.println(n / Math.max(h, w) + 1);
        }
        // Block END.
    }
    }

