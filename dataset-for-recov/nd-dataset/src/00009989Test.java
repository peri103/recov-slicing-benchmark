import org.junit.jupiter.api.Test;

class _00009989Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        String S = ")))())";
        // Block 3:
        while (true) {
            // Block 4:
            int lv = 0;
            // Block 5:
            int lmin = S.length();
            // Block 6:
            for (int i = 0; i < S.length(); i++) {
                // Block 7:
                if (S.charAt(i) == '(') {
                    // Block 8:
                    lv += 1;
                }
                // Block 9:
                else {
                    // Block 10:
                    lv -= 1;
                }
                // Block 11:
                lmin = Math.min(lmin, lv);
            }
            // Block 12:
            if (lmin < 0) {
                // Block 13:
                S = "(".repeat(-lmin) + S;
            }
            // Block 14:
            else break;
        }
        // Block 15:
        int lv = 0;
        // Block 16:
        for (int i = 0; i < S.length(); i++) {
            // Block 17:
            if (S.charAt(i) == '(') {
                // Block 18:
                lv += 1;
            }
            // Block 19:
            else {
                // Block 20:
                lv -= 1;
            }
        }
        // Block 21:
        if (lv > 0) {
            // Block 22:
            S = S + ")".repeat(lv);
        }
        // Block 23:
        System.out.println(S);
        // Block END.
    }
    }

