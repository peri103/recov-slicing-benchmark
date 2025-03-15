import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D";
        String b = "H";
        // Block 2:
        if (a.equals("H")) {
            // Block 3:
            if (b.equals("H")) {
                // Block 4:
                System.out.println("H");
            }
            // Block 5:
            else {
                // Block 6:
                System.out.println("D");
            }
        }
        // Block 7:
        else {
            // Block 8:
            if (b.equals("H")) {
                // Block 9:
                System.out.println("D");
            }
            // Block 10:
            else {
                // Block 11:
                System.out.println("H");
            }
        }
        // Block END.
    }
    }

