import org.junit.jupiter.api.Test;

class _00003760Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int X = 12, Y = 3, Z = 1;
        // Block 2:
        int b = Y + 2 * Z;
        // Block 3:
        int ans = 1;
        // Block 4:
        while (true) {
            // Block 5:
            b += Y + Z;
            // Block 6:
            if (b > X) {
                // Block 7:
                break;
            }
            // Block 8:
            else {
                // Block 9:
                ans += 1;
            }
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

