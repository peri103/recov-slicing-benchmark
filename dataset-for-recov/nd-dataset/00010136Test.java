import org.junit.jupiter.api.Test;

class _00010136Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3;
        // Block 2:
        String s = "())";
        // Block 3:
        int left = 0;
        // Block 4:
        int left_cnt = 0;
        // Block 5:
        for (char i : s.toCharArray()) {
            // Block 6:
            if (i == '(') {
                // Block 7:
                left += 1;
            }
            // Block 8:
            else {
                // Block 9:
                if (left >= 1) {
                    // Block 10:
                    left -= 1;
                }
                // Block 11:
                else {
                    // Block 12:
                    left_cnt += 1;
                }
            }
        }
        // Block 13:
        int right = 0;
        // Block 14:
        int right_cnt = 0;
        // Block 15:
        for (int j = s.length() - 1; j >= 0; j--) {
            char i = s.charAt(j);
            // Block 16:
            if (i == ')') {
                // Block 17:
                right += 1;
            }
            // Block 18:
            else {
                // Block 19:
                if (right >= 1) {
                    // Block 20:
                    right -= 1;
                }
                // Block 21:
                else {
                    // Block 22:
                    right_cnt += 1;
                }
            }
        }
        // Block 23:
        System.out.print("(".repeat(left_cnt) + s + ")".repeat(right_cnt));
        // Block END.
    }
    }

