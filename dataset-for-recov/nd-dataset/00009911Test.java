import org.junit.jupiter.api.Test;

class _00009911Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 3;
        // Block 2:
        String S = "())";
        // Block 3:
        String ans = S;
        // Block 4:
        int cnt = 0;
        // Block 5:
        String now = "";
        // Block 6:
        for (char s : S.toCharArray()) {
            // Block 7:
            now = String.valueOf(s);
            // Block 8:
            if (s == '(') {
                // Block 9:
                cnt++;
            }
            // Block 10:
            else if (s == ')') {
                // Block 11:
                cnt--;
            }
            // Block 12:
            if (cnt == -1) {
                // Block 13:
                ans = "(" + ans;
                // Block 14:
                cnt = 0;
            }
        }
        // Block 15:
        if (cnt > 0) {
            // Block 16:
            ans = ans + ")".repeat(cnt);
        }
        // Block 17:
        System.out.println(ans);
        // Block END.
    }
    }

