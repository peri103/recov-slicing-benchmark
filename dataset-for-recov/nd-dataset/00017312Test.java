import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D";
        String b = "D";
        // Block 2:
        if (a.equals("H") && b.equals("H")) {
            // Block 3:
            System.out.println("H");
        // Block 4:
        } else if (a.equals("D") && b.equals("H")) {
            // Block 5:
            System.out.println("D");
        // Block 6:
        } else if (a.equals("D") && b.equals("D")) {
            // Block 7:
            System.out.println("H");
        // Block 8:
        } else {
            // Block 9:
            System.out.println("D");
        }
        // Block END.
    }
    }

