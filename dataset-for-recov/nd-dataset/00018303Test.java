import org.junit.jupiter.api.Test;

class _00018303Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 14;
        // Block 2:
        int W = 12;
        // Block 3:
        int N = 112;
        // Block 4:
        if (N / H > N / W) {
            // Block 5:
            System.out.println((N % W != 0) ? (N / W) + 1 : (N / W));
        } else {
            // Block 6:
            // Block 7:
            System.out.println((N % H != 0) ? (N / H) + 1 : (N / H));
        }
        // Block END.
    }
    }

