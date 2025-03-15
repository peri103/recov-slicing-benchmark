import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 12, y = 3, z = 1;
        // Block 2:
        int length = x - 2 * z;
        // Block 3:
        int c = 1;
        // Block 4:
        while (true) {
            // Block 5:
            if ((y * c) + (z * (c - 1)) > length) {
                // Block 6:
                break;
            }
            // Block 7:
            c += 1;
        }
        // Block 8:
        System.out.println(c - 1);
        // Block END.
    }
    }

