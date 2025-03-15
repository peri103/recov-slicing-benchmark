import org.junit.jupiter.api.Test;

class _00017733Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1905";
        // Block 2:
        int a1 = Integer.parseInt(s.substring(0, 2));
        // Block 3:
        int a2 = Integer.parseInt(s.substring(2));
        // Block 4:
        if (a1 >= 1 && a1 <= 12) {
            // Block 5:
            if (a2 >= 1 && a2 <= 12) {
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
            if (a2 >= 1 && a2 <= 12) {
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

