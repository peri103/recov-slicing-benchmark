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
            System.out.println(b);
        }
        // Block 4:
        else {
            // Block 5:
            if (b.equals("H")) {
                // Block 6:
                System.out.println('D');
            }
            // Block 7:
            else {
                // Block 8:
                System.out.println('H');
            }
        }
        // Block END.
    }
    }

