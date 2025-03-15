import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'x', 'y', 'z'};
        // Block 2:
        int k = 4;
        // Block 3:
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            // Block 4:
            int t = ('z' - c + 1) % 26;
            // Block 5:
            if (k >= t) {
                // Block 6:
                s[i] = 'a';
                // Block 7:
                k -= t;
            }
        }
        // Block 8:
        int t = k % 26;
        // Block 9:
        s[s.length - 1] = (char) (s[s.length - 1] + t);
        // Block 10:
        System.out.println(String.valueOf(s));
        // Block END.
    }
    }

