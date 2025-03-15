import org.junit.jupiter.api.Test;

class _00000268Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "a";
        // Block 2:
        int k = 25;
        // Block 3:
        StringBuilder ns = new StringBuilder();
        // Block 4:
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            // Block 5:
            if (c == 'a') {
                // Block 6:
                ns.append(c);
                // Block 7:
                continue;
            }
            // Block 8:
            int ofstoa = 'z' + 1 - c;
            // Block 9:
            if (k >= ofstoa) {
                // Block 10:
                ns.append((char) (c + ofstoa - 26));
                // Block 11:
                k -= ofstoa;
            }
            // Block 12:
            else {
                // Block 13:
                ns.append(c);
            }
        }
        // Block 14:
        int last = s.charAt(s.length() - 1);
        // Block 15:
        k = k % 26;
        // Block 16:
        if (last + k > 'z') {
            // Block 17:
            ns.append((char) (last + k - 26));
        }
        // Block 18:
        else {
            // Block 19:
            ns.append((char) (last + k));
        }
        // Block 20:
        System.out.println(ns.toString());
        // Block END.
    }
    }

