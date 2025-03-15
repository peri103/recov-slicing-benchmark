import org.junit.jupiter.api.Test;

class _00000706Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int k = 2;
        // Block 2:
        int flag = 0;
        // Block 3:
        int s = 0;
        // Block 4:
        for (int i = 1; i < 9 * k; i++) {
            // Block 5:
            s += 7;
            // Block 6:
            s %= k;
            // Block 7:
            if (s == 0) {
                // Block 8:
                flag = i;
                // Block 9:
                break;
            }
            // Block 10:
            s *= 10;
        }
        // Block 11:
        if (flag != 0) {
            // Block 12:
            System.out.println(flag);
        }
        // Block 13:
        else {
            // Block 14:
            System.out.println(-1);
        }
        // Block END.
    }
    }

