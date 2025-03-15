import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 100000, y = 1, z = 1;
        // Block 2:
        int count = 1;
        // Block 3:
        x -= 2 * z + y;
        // Block 4:
        count += x / (y + z);
        // Block 5:
        System.out.println(count);
        // Block END.
    }
    }
}
