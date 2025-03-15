import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String n = "D"; 
        String m = "H";
        // Block 2:
        System.out.println("DH".charAt(n.equals(m) ? 1 : 0));
        // Block END.
    }
    }
}
