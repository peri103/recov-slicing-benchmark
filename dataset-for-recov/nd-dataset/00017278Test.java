import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "D"; String b = "H";
        // Block 2:
        if (a.equals("H")) {
            // Block 3:
            System.out.println(b.equals("H") ? "H" : "D");
        }
        // Block 4:
        else if (a.equals("D")) {
            // Block 5:
            System.out.println(b.equals("H") ? "D" : "H");
        }
        // Block END.
    }
    }
}
