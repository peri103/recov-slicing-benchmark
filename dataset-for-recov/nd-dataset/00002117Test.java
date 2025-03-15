import org.junit.jupiter.api.Test;

class _00002117Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        int max;
        if (A > B) {
            // Block 3:
            max = B;
        // Block 4:
        } else {
            // Block 5:
            max = A;
        }
        // Block 6:
        int min;
        if (A + B > N) {
            // Block 7:
            min = A + B - N;
        // Block 8:
        } else {
            // Block 9:
            min = 0;
        }
        // Block 10:
        System.out.println(max + " " + min);
        // Block END.
    }
    }

