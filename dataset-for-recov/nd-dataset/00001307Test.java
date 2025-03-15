import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 750;
        // Block 2:
        String X = String.valueOf(N);
        // Block 3:
        int Y = (int) X.chars().distinct().count();
        // Block 4:
        if (Y == 1) {
            // Block 5:
            System.out.println(N);
        }
        // Block 6:
        if (Y != 1) {
            // Block 7:
            int Z = 0;
            // Block 8:
            for (int i = 111; i < 1000; i += 111) {
                // Block 9:
                if (N - i < 0) {
                    // Block 10:
                    Z += i;
                    // Block 11:
                    break;
                }
            }
            // Block 12:
            System.out.println(Z);
        }
        // Block END.
    }
    }

