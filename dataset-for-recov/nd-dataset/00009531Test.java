import org.junit.jupiter.api.Test;

class _00009531Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "2017/01/31";
        // Block 2:
        S = S.substring(0, 3) + "8" + S.substring(4);
        // Block 3:
        System.out.println(S);
        // Block END.
    }
    }

