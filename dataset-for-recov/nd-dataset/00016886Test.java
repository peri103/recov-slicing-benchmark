import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String A = "D"; 
        String B = "D";
        // Block 2:
        if (A.equals("H")) {
            // Block 3:
            if (B.equals("H")) {
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
        else if (A.equals("D")) {
            // Block 8:
            if (B.equals("H")) {
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

