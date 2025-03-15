import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 13, y = 3, z = 1;
        // Block 2:
        x -= z;
        // Block 3:
        int c = 0;
        // Block 4:
        while (x - (y + z) >= 0) {
            // Block 5:
            x -= y + z;
            // Block 6:
            c += 1;
        }
        // Block 7:
        System.out.println(c);
        // Block END.
    }
    }

