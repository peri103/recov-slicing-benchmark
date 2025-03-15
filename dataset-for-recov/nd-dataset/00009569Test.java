import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "2017/01/31";
        // Block 2:
        s = "2018/01" + s.substring(7, 10);
        // Block 3:
        System.out.println(s);
        // Block END.
    }
    }

