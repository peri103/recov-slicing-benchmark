import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "2017/01/07";
        // Block 2:
        String S = "2018";
        // Block 3:
        S += s.substring(4);
        // Block 4:
        System.out.println(S);
        // Block END.
    }
    }
}
