import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int N1 = N / 10;
        // Block 3:
        if (N % 2 == 1) {
            // Block 4:
            System.out.println(0);
        } else {
            // Block 5:
            int counter = 0;
            // Block 6:
            int div = 10;
            // Block 7:
            while (true) {
                // Block 8:
                int num = N / div;
                // Block 9:
                if (num == 0) {
                    // Block 10:
                    break;
                }
                // Block 11:
                counter += num;
                // Block 12:
                div *= 5;
            }
            // Block 13:
            System.out.println(counter);
        }
        // Block END.
    }
    }

