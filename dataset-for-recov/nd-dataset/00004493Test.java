import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String a = "smiles";
        // Block 2:
        String b = a.charAt(0) + Integer.toString(a.length() - 2) + a.charAt(a.length() - 1);
        // Block 3:
        System.out.println(b);
        // Block END.
    }
    }

