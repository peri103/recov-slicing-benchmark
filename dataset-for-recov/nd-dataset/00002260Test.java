import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 3, b = 5;
        // Block 2:
        System.out.println(Math.min(a, b) + " " + (a + b - n > 0 ? a + b - n : 0));
        // Block END.
    }
    }

