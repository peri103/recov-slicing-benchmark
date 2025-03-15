import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "xyz";
        // Block 2:
        System.out.println(String.format("%s%d%s", S.charAt(0), S.length() - 2, S.charAt(S.length() - 1)));
        // Block END.
    }
    }

