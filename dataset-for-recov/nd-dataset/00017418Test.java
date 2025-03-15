import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1905";
        // Block 2:
        int a = Integer.parseInt(s.substring(0, 2));
        // Block 3:
        int b = Integer.parseInt(s.substring(2));
        // Block 4:
        if (0 < a && a < 13) {
            // Block 5:
            if (0 < b && b < 13) {
                // Block 6:
                System.out.println("AMBIGUOUS");
            }
            // Block 7:
            else {
                // Block 8:
                System.out.println("MMYY");
            }
        }
        // Block 9:
        else {
            // Block 10:
            if (0 < b && b < 13) {
                // Block 11:
                System.out.println("YYMM");
            }
            // Block 12:
            else {
                // Block 13:
                System.out.println("NA");
            }
        }
        // Block END.
    }
    }
}
