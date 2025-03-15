import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'x', 'y', 'z'};
        // Block 2:
        String t = Integer.toString(s.length - 2);
        // Block 3:
        System.out.println(s[0] + t + s[s.length - 1]);
        // Block END.
    }
    }
}
