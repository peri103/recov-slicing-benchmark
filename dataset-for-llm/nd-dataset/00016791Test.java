import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "H", b = "H";
        // Block 2:
        if (a.equals("H")) {
            // Block 3:
            if (b.equals("H")) {
                System.out.println("H");
            }
            // Block 4:
            else {
                System.out.println("D");
            }
        }
        // Block 5:
        else {
            // Block 6:
            if (b.equals("H")) {
                System.out.println("D");
            }
            // Block 7:
            else {
                System.out.println("H");
            }
        }
        // Block END.
    }
    }
}
