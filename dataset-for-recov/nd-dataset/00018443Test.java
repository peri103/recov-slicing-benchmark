import org.junit.jupiter.api.Test;

class _00018443Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int A = 3;
        // Block 2:
        int B = 7;
        // Block 3:
        int N = 10;
        // Block 4:
        if (A < B) {
            // Block 5:
            int X = N / B;
            // Block 6:
            if (N % B == 0) {
                // Block 7:
                System.out.println(X);
            }
            // Block 8:
            else {
                // Block 9:
                System.out.println(X + 1);
            }
        }
        // Block 10:
        else {
            // Block 11:
            int X = N / A;
            // Block 12:
            if (N % A == 0) {
                // Block 13:
                System.out.println(X);
            }
            // Block 14:
            else {
                // Block 15:
                System.out.println(X + 1);
            }
        }
        // Block END.
    }
    }

