import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        System.out.println(String.format("%d %d", Math.min(a, b), Math.max(a + b - n, 0)));
        // Block END.
    }
    }

