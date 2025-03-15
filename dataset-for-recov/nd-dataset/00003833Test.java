import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 13, y = 3, z = 1;
        // Block 2:
        int i = 0;
        // Block 3:
        while (y * i + z * (i + 1) <= x) {
            // Block 4:
            i += 1;
        }
        // Block 5:
        i -= 1;
        // Block 6:
        System.out.println(i);
        // Block END.
    }
    }

