import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "internationalization";
        // Block 2:
        int c = S.length();
        // Block 3:
        System.out.println(S.charAt(0) + Integer.toString(c - 2) + S.charAt(S.length() - 1));
        // Block END.
    }
    }
}
