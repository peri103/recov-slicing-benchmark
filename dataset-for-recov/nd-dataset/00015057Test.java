import org.junit.jupiter.api.Test;

class _00015057Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3, P = 0;
        // Block 2:
        int odd = 3;
        // Block 3:
        int even = N - odd;
        // Block 4:
        if (odd == 0) {
            // Block 5:
            if (P == 0) {
                // Block 6:
                System.out.println((int) Math.pow(2, even));
            }
            // Block 7:
            else {
                // Block 8:
                System.out.println(0);
            }
        }
        // Block 9:
        else {
            // Block 10:
            System.out.println((int) (Math.pow(2, even) * (Math.pow(2, odd) / 2)));
        }
        // Block END.
    }
    }

