import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'2', '0', '1', '7', '/', '0', '1', '/', '0', '7'};
        // Block 2:
        s[3] = '8';
        // Block 3:
        String result = String.valueOf(s);
        // Block 4:
        System.out.println(result);
        // Block END.
    }
    }

