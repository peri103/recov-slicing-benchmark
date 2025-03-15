import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        double n = 10.0, a = 7.0, b = 5.0;
        // Block 2:
        System.out.println((int) Math.min(a, b) + " " + (int) Math.max(a + b - n, 0));
        // Block END.
    }
    }

