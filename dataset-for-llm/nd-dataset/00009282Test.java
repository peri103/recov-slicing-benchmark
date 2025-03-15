import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] x = {'2', '0', '1', '7', '/', '0', '1', '/', '0', '7'};
        // Block 2:
        x[3] = '8';
        // Block 3:
        System.out.println(String.valueOf(x));
        // Block END.
    }
    }
}
