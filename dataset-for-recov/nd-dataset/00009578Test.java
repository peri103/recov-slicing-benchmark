import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "2017/01/07";
        // Block 2:
        System.out.println("2018/01/" + s.substring(s.length() - 2));
        // Block END.
    }
    }

