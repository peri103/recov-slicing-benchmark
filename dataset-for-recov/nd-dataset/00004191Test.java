import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 12, M2 = 0, K = 120;
        // Block 2:
        int h1 = 60 * H1 + M1;
        // Block 3:
        int h2 = 60 * H2 + M2;
        // Block 4:
        int d = h2 - h1;
        // Block 5:
        System.out.println(d - K);
        // Block END.
    }
    }

