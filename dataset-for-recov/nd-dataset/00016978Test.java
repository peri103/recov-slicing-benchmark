import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        boolean a = false, b = true;
        // Block 2:
        if (a ^ b) {
            // Block 3:
            System.out.println("D");
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println("H");
        }
        // Block END.
    }
    }

