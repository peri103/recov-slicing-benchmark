import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 64145, y = 123, z = 456;
        // Block 2:
        int count = 0;
        // Block 3:
        x -= z;
        // Block 4:
        System.out.println(x / (y + z));
        // Block END.
    }
    }
}
