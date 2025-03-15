import org.junit.jupiter.api.Test;

class _00014724Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 1, P = 1;
        // Block 2:
        int[] A = {50};
        // Block 3:
        boolean inOdd = false;
        // Block 4:
        for (int i = 0; i < N; i++) {
            // Block 5:
            if (A[i] % 2 != 0) {
                // Block 6:
                inOdd = true;
                // Block 7:
                break;
            }
        }
        // Block 8:
        if (!inOdd) {
            // Block 9:
            if (P != 0) {
                // Block 10:
                System.out.println(0);
            }
            // Block 11:
            else {
                // Block 12:
                System.out.println(Math.pow(2, N));
            }
        }
        // Block 13:
        else {
            // Block 14:
            System.out.println(Math.pow(2, N - 1));
        }
        // Block END.
    }
    }

