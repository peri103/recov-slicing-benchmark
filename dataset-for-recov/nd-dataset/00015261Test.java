import org.junit.jupiter.api.Test;

class _00015261Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int x = 13, y = 3, z = 1;
        // Block 2:
        int s = z;
        // Block 3:
        int count = 0;
        // Block 4:
        for (long i = 0; i < Math.pow(10, 99); i++) {
            // Block 5:
            s += y;
            // Block 6:
            if (s <= x - z) {
                // Block 7:
                count += 1;
            // Block 8:
            } else if (s > x - z) {
                // Block 9:
                break;
            }
            // Block 10:
            s += z;
        }
        // Block 11:
        System.out.println(count);
        // Block END.
    }
    }

