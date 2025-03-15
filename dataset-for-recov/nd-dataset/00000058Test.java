import org.junit.jupiter.api.Test;

class _00000058Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "a";
        // Block 2:
        int k = 25;
        // Block 3:
        StringBuilder ans = new StringBuilder();
        // Block 4:
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            // Block 5:
            int to_a = ('z' - c + 1) % 26;
            // Block 6:
            if (k < to_a) {
                // Block 7:
                ans.append(c);
            }
            // Block 8:
            else {
                // Block 9:
                k -= to_a;
                // Block 10:
                ans.append('a');
            }
        }
        // Block 11:
        {
            // Block 12:
            char c = s.charAt(s.length() - 1);
            // Block 13:
            int x = c - 'a';
            // Block 14:
            int y = (k + x) % 26;
            // Block 15:
            ans.append((char) ('a' + y));
        }
        // Block 16:
        System.out.println(ans.toString());
        // Block END.
    }
    }

