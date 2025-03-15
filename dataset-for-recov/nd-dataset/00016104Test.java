import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 12, b = 4;
        // Block 2:
        int result = a - (b * 2);
        // Block 3:
        if (result <= 0) {
            // Block 4:
            result = 0;
        }
        // Block 5:
        System.out.println(result);
        // Block END.
    }
    }

