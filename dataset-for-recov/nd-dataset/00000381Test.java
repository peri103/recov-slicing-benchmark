import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'a'};
        // Block 2:
        int K = 25;
        // Block 3:
        int i = 0;
        // Block 4:
        while (i < s.length) {
            // Block 5:
            if (i == s.length - 1) {
                // Block 6:
                s[i] = (char) (97 + (s[i] - 97 + K) % 26);
                // Block 7:
                break;
            }
            // Block 8:
            if (K < Math.abs(123 - s[i]) % 26) {
                // Block 9:
                i += 1;
            }
            // Block 10:
            else if (K >= Math.abs(123 - s[i]) % 26) {
                // Block 11:
                int sub = Math.abs(123 - s[i]) % 26;
                // Block 12:
                s[i] = 'a';
                // Block 13:
                K -= sub;
                // Block 14:
                i += 1;
            }
        }
        // Block 15:
        System.out.println(String.valueOf(s));
        // Block END.
    }
    }
}
