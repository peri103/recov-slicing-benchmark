import org.junit.jupiter.api.Test;

class _00005102Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "smiles";
        // Block 2:
        char start = S.charAt(0);
        // Block 3:
        char end = S.charAt(S.length() - 1);
        // Block 4:
        int num = S.length() - 2;
        // Block 5:
        System.out.println(String.format("%c%d%c", start, num, end));
        // Block END.
    }
    }

