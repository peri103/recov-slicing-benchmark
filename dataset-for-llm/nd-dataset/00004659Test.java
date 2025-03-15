import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "xyz";
        // Block 2:
        int N = S.length() - 2;
        // Block 3:
        System.out.println(S.charAt(0) + String.valueOf(N) + S.charAt(S.length() - 1));
        // Block END.
    }
    }
}
