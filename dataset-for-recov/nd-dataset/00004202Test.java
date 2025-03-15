import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H1 = 10, M1 = 0, H2 = 15, M2 = 0, K = 30;
        // Block 2:
        if (M2 < M1) {
            // Block 3:
            int m = 60 - (M1 - M2);
            // Block 4:
            System.out.println((H2 - H1 - 1) * 60 + m - K);
        // Block 5:
        } else {
            // Block 6:
            System.out.println((H2 - H1) * 60 + (M2 - M1) - K);
        }
        // Block END.
    }
    }

