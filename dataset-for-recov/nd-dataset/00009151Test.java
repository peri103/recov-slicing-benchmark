import org.junit.jupiter.api.Test;

class _00009151Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "2017/01/31";
        // Block 2:
        S = "2018/01/" + S.substring(8, 10);
        // Block 3:
        System.out.println(S);
        // Block END.
    }
    }

