import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        int a = s.length();
        // Block 3:
        int b = s.length() - 2;
        // Block 4:
        String x = s.charAt(0) + Integer.toString(b) + s.charAt(s.length() - 1);
        // Block 5:
        System.out.println(x);
        // Block END.
    }
    }
}
