import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "2017/01/31";
        // Block 2:
        S = "2018" + S.substring(4);
        // Block 3:
        System.out.println(S);
        // Block END.
    }
    }

