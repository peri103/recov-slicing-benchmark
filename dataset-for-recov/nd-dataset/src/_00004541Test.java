import org.junit.jupiter.api.Test;

class _00004541Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "smiles";
        // Block 2:
        String ans = s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1);
        // Block 3:
        System.out.println(ans);
        // Block END.
    }
    }

