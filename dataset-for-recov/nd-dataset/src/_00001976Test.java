import org.junit.jupiter.api.Test;

class _00001976Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        System.out.println(Math.min(a, b));
        // Block 3:
        if (a + b < n) {
            System.out.println(0);
        }
        // Block 4:
        else {
            System.out.println(a + b - n);
        }
        // Block END.
    }
    }

