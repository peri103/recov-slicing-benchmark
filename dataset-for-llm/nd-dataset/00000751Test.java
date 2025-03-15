import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int k = 2;
        // Block 2:
        int s = 7;
        // Block 3:
        int num = 1;
        // Block 4:
        boolean res = true;
        // Block 5:
        if (k == 2) {
            // Block 6:
            System.out.println(-1);
        }
        // Block 7:
        else {
            // Block 8:
            for (int i = 0; i < k; i++) {
                // Block 9:
                s %= k;
                // Block 10:
                if (s == 0) {
                    // Block 11:
                    res = false;
                    // Block 12:
                    System.out.println(num);
                    // Block 13:
                    break;
                }
                // Block 14:
                num += 1;
                // Block 15:
                s *= 10;
                // Block 16:
                s += 7;
            }
            // Block 17:
            if (res) {
                // Block 18:
                System.out.println(-1);
            }
        }
        // Block END.
    }
    }
}
