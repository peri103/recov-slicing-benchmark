import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 12;
        // Block 2:
        if (N % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int divide = 2;
            // Block 6:
            int count = 0;
            // Block 7:
            while (divide < N) {
                // Block 8:
                divide *= 5;
                // Block 9:
                count += N / divide;
            }
            // Block 10:
            System.out.println(count);
        }
        // Block END.
    }
    }

