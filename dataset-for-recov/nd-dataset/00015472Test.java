import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
        // Block 2:
        int ans = 0;
        // Block 3:
        X -= Z;
        // Block 4:
        for (int i = 0; i < X; i++) {
            // Block 5:
            if (X < (Y + Z)) {
                // Block 6:
                System.out.println(ans);
                // Block 7:
                break;
            }
            // Block 8:
            else {
                // Block 9:
                ans += 1;
                // Block 10:
                X -= (Y + Z);
            }
        }
        // Block END.
    }
    }

