import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "2017/01/31";
        // Block 2:
        System.out.println(S.replace(S.substring(0, 4), "2018"));
        // Block END.
    }
    }
}
