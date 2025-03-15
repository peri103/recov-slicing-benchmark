import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        char a = s.charAt(0);
        // Block 3:
        char b = s.charAt(s.length() - 1);
        // Block 4:
        String c = s.substring(1, s.length() - 1);
        // Block 5:
        System.out.println(a + String.valueOf(c.length()) + b);
        // Block END.
    }
    }

