import org.junit.jupiter.api.Test;

class _00015546Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 64146, y = 123, z = 456;
        // Block 2:
        x -= 2 * z;
        // Block 3:
        System.out.println(x / (y + z) + x % (y + z) / y);
        // Block END.
    }
    }

