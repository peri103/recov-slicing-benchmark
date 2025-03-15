import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 2, W = 1;
        // Block 2:
        int total1 = 0;
        // Block 3:
        int total2 = 0;
        // Block 4:
        if (N > 1) {
            // Block 5:
            total1 = N * (N - 1) / 2;
        }
        // Block 6:
        else {
            // Block 7:
            total1 = 0;
        }
        // Block 8:
        if (W >= 2) {
            // Block 9:
            total2 = W * (W - 1) / 2;
        }
        // Block 10:
        else {
            // Block 11:
            total2 = 0;
        }
        // Block 12:
        System.out.println(total1 + total2);
        // Block END.
    }
    }

