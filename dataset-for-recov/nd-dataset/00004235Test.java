import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int[] h = {10, 0, 12, 0, 120};
        // Block 2:
        if (h[1] < h[3]) {
            // Block 3:
            System.out.println((h[2] - h[0]) * 60 + h[3] - h[1] - h[4]);
        // Block 4:
        } else {
            // Block 5:
            System.out.println((h[2] - h[0] - 1) * 60 + 60 - h[1] + h[3] - h[4]);
        }
        // Block END.
    }
    }

