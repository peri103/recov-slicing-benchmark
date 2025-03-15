import org.junit.jupiter.api.Test;

class _00004925Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        char s1 = s.charAt(0);
        String s2 = s.substring(1, s.length() - 1);
        char s3 = s.charAt(s.length() - 1);
        // Block 3:
        String ans = s1 + String.valueOf(s2.length()) + s3;
        // Block 4:
        System.out.println(ans);
        // Block END.
    }
    }

