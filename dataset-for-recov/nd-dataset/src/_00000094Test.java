import org.junit.jupiter.api.Test;

class _00000094Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'x', 'y', 'z'};
        // Block 2:
        int k = 4;
        // Block 3:
        int n = s.length;
        // Block 4:
        for (int i = 0; i < n; i++) {
            // Block 5:
            if (s[i] == 'a') continue;
            // Block 6:
            int d = 'z' - s[i] + 1;
            // Block 7:
            if (d <= k) {
                // Block 8:
                s[i] = 'a';
                // Block 9:
                k -= d;
            }
        }
        // Block 10:
        int x = ('z' - s[s.length - 1] + k) % 26;
        // Block 11:
        s[s.length - 1] = (char) ('a' + x);
        // Block 12:
        System.out.println(String.valueOf(s));
        // Block END.
    }
    }

