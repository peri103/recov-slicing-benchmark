import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 2;
        // Block 2:
        int w = 100;
        // Block 3:
        int n = 200;
        // Block 4:
        System.out.println(Math.min((n + h - 1) / h, (n + w - 1) / w));
        // Block END.
    }
    }

