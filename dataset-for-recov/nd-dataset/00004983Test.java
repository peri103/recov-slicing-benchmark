import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'x', 'y', 'z'};
        // Block 2:
        int num = s.length;
        // Block 3:
        String output = s[0] + Integer.toString(num - 2) + s[num - 1];
        // Block 4:
        System.out.println(output);
        // Block END.
    }
    }

