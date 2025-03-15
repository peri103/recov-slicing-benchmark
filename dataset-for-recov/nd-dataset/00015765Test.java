import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 64145, y = 123, z = 456;
        // Block 2:
        int mitumori = x / (y + z);
        // Block 3:
        if (x - mitumori * (y + z) >= z) {
            System.out.println(mitumori);
        // Block 4:
        } else {
            System.out.println(mitumori - 1);
        }
        // Block END.
    }
    }

