import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 100000, y = 1, z = 1;
        // Block 2:
        x -= z;
        // Block 3:
        int r = x / (y + z);
        // Block 4:
        System.out.println(r);
        // Block END.
    }
    }
}
