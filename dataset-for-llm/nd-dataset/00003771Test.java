import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 64146, y = 123, z = 456;
        // Block 2:
        x -= z;
        // Block 3:
        System.out.println((int)(x / (y + z)));
        // Block END.
    }
    }
}
