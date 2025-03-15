import org.junit.jupiter.api.Test;

class _00017669Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1700";
        // Block 2:
        int x = Integer.parseInt(S.substring(0, 2));
        // Block 3:
        int y = Integer.parseInt(S.substring(2));
        // Block 4:
        if (x == 0) {
            // Block 5:
            if (0 < y && y <= 12) {
                // Block 6:
                System.out.println("YYMM");
            }
            // Block 7:
            else {
                // Block 8:
                System.out.println("NA");
            }
        }
        // Block 9:
        else if (0 < x && x <= 12) {
            // Block 10:
            if (0 < y && y <= 12) {
                // Block 11:
                System.out.println("AMBIGUOUS");
            }
            // Block 12:
            else {
                // Block 13:
                System.out.println("MMYY");
            }
        }
        // Block 14:
        else if (x >= 13) {
            // Block 15:
            if (0 < y && y <= 12) {
                // Block 16:
                System.out.println("YYMM");
            }
            // Block 17:
            else {
                // Block 18:
                System.out.println("NA");
            }
        }
        // Block END.
    }
    }

