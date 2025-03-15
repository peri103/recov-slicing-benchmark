import org.junit.jupiter.api.Test;

class _00002083Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        int high = Math.min(a, b);
        // Block 3:
        int low = Math.max(0, a + b - n);
        // Block 4:
        System.out.println(high + " " + low);
        // Block END.
    }
    }

