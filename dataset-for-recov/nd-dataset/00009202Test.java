import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "2017/01/07";
        // Block 2:
        String x = "2018" + s.substring(4);
        // Block 3:
        System.out.println(x);
        // Block END.
    }
    }

