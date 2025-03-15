import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "H"; String b = "H";
        // Block 2:
        if (a.equals("H")) {
            // Block 3:
            System.out.println(b);
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println("HD".charAt(b.equals("H") ? 0 : 1));
        }
        // Block END.
    }
    }

