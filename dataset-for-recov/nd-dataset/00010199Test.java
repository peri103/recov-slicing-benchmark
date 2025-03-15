import org.junit.jupiter.api.Test;

class _00010199Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3;
        // Block 2:
        char[] s = {'(', ')', ')'};
        // Block 3:
        int l_ins = 0;
        // Block 4:
        int l = 0;
        // Block 5:
        int r = 0;
        // Block 6:
        for (int i = 0; i < n; i++) {
            // Block 7:
            if (s[i] == '(') {
                // Block 8:
                l += 1;
            }
            // Block 9:
            else {
                // Block 10:
                r += 1;
            }
            // Block 11:
            l_ins = Math.max(l_ins, r - l);
        }
        // Block 12:
        int r_ins = 0;
        // Block 13:
        l = 0;
        // Block 14:
        r = 0;
        // Block 15:
        for (int i = n - 1; i >= 0; i--) {
            // Block 16:
            if (s[i] == '(') {
                // Block 17:
                l += 1;
            }
            // Block 18:
            else {
                // Block 19:
                r += 1;
            }
            // Block 20:
            r_ins = Math.max(r_ins, l - r);
        }
        // Block 21:
        char[] ar = new char[l_ins + n + r_ins];
        for (int i = 0; i < l_ins; i++) {
            ar[i] = '(';
        }
        System.arraycopy(s, 0, ar, l_ins, n);
        for (int i = 0; i < r_ins; i++) {
            ar[l_ins + n + i] = ')';
        }
        // Block 22:
        System.out.println(String.valueOf(ar));
        // Block END.
    }
    }

