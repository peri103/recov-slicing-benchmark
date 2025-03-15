import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "internationalization";
        // Block 2:
        int n = s.length();
        // Block 3:
        char[] S = s.toCharArray();
        // Block 4:
        String t = S[0] + Integer.toString(n - 2) + S[n - 1];
        // Block 5:
        System.out.println(t);
        // Block END.
    }
    }
}
