import org.junit.jupiter.api.Test;

class _00018184Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int S = 1700;
        // Block 2:
        int L = S / 100;
        // Block 3:
        int R = S % 100;
        // Block 4:
        if (1 <= L && L <= 12) {
            // Block 5:
            if (1 <= R && R <= 12) {
                System.out.println("AMBIGUOUS");
            }
            // Block 6:
            else {
                System.out.println("MMYY");
            }
        }
        // Block 7:
        else {
            // Block 8:
            if (1 <= R && R <= 12) {
                System.out.println("YYMM");
            }
            // Block 9:
            else {
                System.out.println("NA");
            }
        }
        // Block END.
    }
    }

