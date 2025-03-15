import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3;
        // Block 2:
        String S = "())";
        // Block 3:
        int left = 0;
        // Block 4:
        int right = 0;
        // Block 5:
        int left_ans = 0;
        // Block 6:
        int right_ans = 0;
        // Block 7:
        for (int i = 0; i < N; i++) {
            // Block 8:
            char now = S.charAt(i);
            // Block 9:
            if (now == '(') {
                // Block 10:
                left += 1;
            // Block 11:
            } else {
                // Block 12:
                right += 1;
                // Block 13:
                if (left == 0) {
                    // Block 14:
                    left_ans += 1;
                // Block 15:
                } else {
                    // Block 16:
                    left -= 1;
                    // Block 17:
                    left = Math.max(0, left);
                }
            }
        }
        // Block 18:
        String S_mirror = "";
        // Block 19:
        for (int i = N - 1; i >= 0; i--) {
            // Block 20:
            if (S.charAt(i) == '(') {
                // Block 21:
                S_mirror += ")";
            // Block 22:
            } else {
                // Block 23:
                S_mirror += "(";
            }
        }
        // Block 24:
        left = 0;
        // Block 25:
        right = 0;
        // Block 26:
        right_ans = 0;
        // Block 27:
        for (int i = 0; i < N; i++) {
            // Block 28:
            char now = S_mirror.charAt(i);
            // Block 29:
            if (now == '(') {
                // Block 30:
                left += 1;
            // Block 31:
            } else {
                // Block 32:
                right += 1;
                // Block 33:
                if (left == 0) {
                    // Block 34:
                    right_ans += 1;
                // Block 35:
                } else {
                    // Block 36:
                    left -= 1;
                    // Block 37:
                    left = Math.max(0, left);        
                }
            }
        }
        // Block 38:
        String ans = "(".repeat(left_ans) + S + ")".repeat(right_ans);
        // Block 39:
        System.out.println(ans);
        // Block END.
    }
    }

