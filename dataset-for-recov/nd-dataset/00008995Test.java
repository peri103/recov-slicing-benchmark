import org.junit.jupiter.api.Test;

class _00008995Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int a = 15, b = 18, c = 26, d = 35, e = 36, k = 18;
        // Block 2:
        int[] l = {a, b, c, d, e};
        // Block 3:
        int f = 0;
        // Block 4:
        for (int i = 0; i < 4; i++) {
            // Block 5:
            for (int j = i + 1; j < 5; j++) {
                // Block 6:
                int dValue = Math.abs(l[j] - l[i]);
                // Block 7:
                if (dValue > k) {
                    // Block 8:
                    f = 1;
                    // Block 9:
                    break;
                }
            }
        }
        // Block 10:
        if (f == 0) {
            // Block 11:
            System.out.println("Yay!");
        }
        // Block 12:
        else {
            // Block 13:
            System.out.println(":(");
        }
        // Block END.
    }
    }

