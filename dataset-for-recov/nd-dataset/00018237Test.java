import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int H = 3;
        // Block 2:
        int W = 7;
        // Block 3:
        int N = 10;
        // Block 4:
        int X = 0;
        // Block 5:
        if (H <= W) {
            // Block 6:
            X = N / W;
            // Block 7:
            if (N % W != 0) {
                // Block 8:
                X = X + 1;
            }
        }
        // Block 9:
        else {
            // Block 10:
            X = N / H;
            // Block 11:
            if (N % H != 0) {
                // Block 12:
                X = X + 1;
            }
        }
        // Block 13:
        System.out.println(X);
        // Block END.
    }
    }

