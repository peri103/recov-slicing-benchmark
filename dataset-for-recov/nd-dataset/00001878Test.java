import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int x;
        if (A < B) {
            // Block 3:
            x = A;
        } else {
            // Block 4:
            x = B;
        }
        // Block 6:
        int y;
        if (A + B - N < 0) {
            // Block 7:
            y = 0;
        } else {
            // Block 8:
            y = A + B - N;
        }
        // Block 10:
        System.out.println(x + " " + y);
        // Block END.
    }
    }

