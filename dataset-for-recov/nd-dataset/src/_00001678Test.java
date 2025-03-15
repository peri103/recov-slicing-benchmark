import org.junit.jupiter.api.Test;

class _00001678Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 100, a = 100, b = 100;
        // Block 2:
        int MAX, MIN;
        if (n >= (a + b)) {
            // Block 3:
            MAX = Math.min(a, b);
            // Block 4:
            MIN = 0;
        } else {
            // Block 5:
            MAX = Math.min(a, b);
            // Block 6:
            MIN = a + b - n;
        }
        // Block 8:
        System.out.println(MAX + " " + MIN);
        // Block END.
    }
    }

