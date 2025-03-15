import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D"; String b = "D";
        // Block 2:
        if (a.equals("H")) {
            // Block 3:
            System.out.println(b);
            // Block 4:
            System.exit(0);
        }
        // Block 5:
        else {
            // Block 6:
            if (b.equals("H")) {
                // Block 7:
                System.out.println("D");
            }
            // Block 8:
            else {
                // Block 9:
                System.out.println("H");
            }
        }
        // Block END.
    }
    }
}
