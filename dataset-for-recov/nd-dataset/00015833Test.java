import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
        // Block 2:
        int sum = 0;
        int ans = 0; // Initialize ans to be used later
        // Block 3:
        for (int i = 1; i < X; i++) {
            // Block 4:
            if (sum > X) {
                // Block 5:
                ans = i - 2;
                // Block 6:
                break;
            }
            // Block 7:
            if (sum == X) {
                // Block 8:
                ans = i - 1;
                // Block 9:
                break;
            }
            // Block 10:
            else {
                // Block 11:
                sum = Y * i + Z * (i + 1);
            }
        }
        // Block 12:
        System.out.println(ans);
        // Block END.
    }
    }

