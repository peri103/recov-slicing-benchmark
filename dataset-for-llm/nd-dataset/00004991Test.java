import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        String ans = s.charAt(0) + Integer.toString(s.length() - 2) + s.charAt(s.length() - 1);
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
    }
}
