import org.junit.jupiter.api.Test;

class _00000315Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'x', 'y', 'z'};
        // Block 2:
        int k = 4;
        // Block 3:
        int z = 'z';
        // Block 4:
        int a = 'a';
        // Block 5:
        for (int i = 0; i < s.length - 1; i++) {
            // Block 6:
            if (s[i] == 'a') {
                // Block 7:
                continue;
            }
            // Block 8:
            if (z - s[i] + 1 <= k) {
                // Block 9:
                k -= z - s[i] + 1;
                // Block 10:
                s[i] = 'a';
            }
        }
        // Block 11:
        if (k > 0) {
            // Block 12:
            k = k % 26;
            // Block 13:
            int x = z - s[s.length - 1] + 1;
            // Block 14:
            if (k >= x) {
                // Block 15:
                k -= z - s[s.length - 1] + 1;
                // Block 16:
                s[s.length - 1] = (char) (a + k);
            }
            // Block 17:
            else {
                // Block 18:
                s[s.length - 1] = (char) (s[s.length - 1] + k);
            }
        }
        // Block 19:
        System.out.println(String.valueOf(s));
        // Block END.
    }
    }

