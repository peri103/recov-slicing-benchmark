import org.junit.jupiter.api.Test;

class _00014655Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 2, P = 0;
        // Block 2:
        int[] A = {1, 3};
        // Block 3:
        int su = (int) Math.pow(2, N);
        // Block 4:
        boolean guusu = true;
        // Block 5:
        for (int a : A) {
            // Block 6:
            if (a % 2 == 1) {
                // Block 7:
                guusu = false;
                // Block 8:
                break;
            }
        }
        // Block 9:
        if (P == 0) {
            // Block 10:
            System.out.println(guusu ? su : su / 2);
        } 
        // Block 11:
        else {
            // Block 12:
            System.out.println(guusu ? 0 : su / 2);
        }
        // Block END.
    }
    }

