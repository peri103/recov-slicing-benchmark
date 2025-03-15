import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'s', 'm', 'i', 'l', 'e', 's'};
        // Block 2:
        String y = String.valueOf(s.length - 2);
        // Block 3:
        System.out.println(s[0] + y + s[s.length - 1]);
        // Block END.
    }
    }
}
