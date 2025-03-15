import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "2017/01/31";
        // Block 2:
        String day = S.substring(S.length() - 6);
        // Block 3:
        System.out.println("2018" + day);
        // Block END.
    }
    }
}
