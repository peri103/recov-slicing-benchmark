import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 10, m = 0, H = 12, M = 0, K = 120;
        // Block 2:
        System.out.println(Math.max(0, (H - h) * 60 + M - m - K));
        // Block END.
    }
    }

