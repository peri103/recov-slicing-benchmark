import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D"; 
        String b = "D";
        // Block 2:
        if (a.equals("H")) {
            // Block 3:
            System.out.println(b);
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println("HD".replace(b, ""));
        }
        // Block END.
    }
    }

