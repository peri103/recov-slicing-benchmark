import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 20, b = 15;
        // Block 2:
        b *= 2;
        // Block 3:
        if (b > a) {
            // Block 4:
            System.out.println(0);
        // Block 5:
        } else {
            // Block 6:
            System.out.println(Math.abs(a - b));
        }
        // Block END.
    }
    }
}
