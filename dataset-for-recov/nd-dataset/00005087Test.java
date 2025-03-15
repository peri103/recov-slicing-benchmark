import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'s', 'm', 'i', 'l', 'e', 's'};
        // Block 2:
        String ans = String.valueOf(s[0]);
        // Block 3:
        ans += String.valueOf(s.length - 2);
        // Block 4:
        ans += s[s.length - 1];
        // Block 5:
        System.out.println(ans);
        // Block END.
    }
    }

