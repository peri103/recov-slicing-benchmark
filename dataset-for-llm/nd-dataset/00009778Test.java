import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3;
        // Block 2:
        char[] s = {'(', ')', ')'};
        // Block 3:
        String ans = "";
        // Block 4:
        int l = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            ans += s[i];
            // Block 7:
            if (s[i] == ')') {
                // Block 8:
                if (l == 0) {
                    // Block 9:
                    ans = '(' + ans;
                }
                // Block 10:
                else {
                    // Block 11:
                    l -= 1;
                }
            }
            // Block 12:
            else {
                // Block 13:
                l += 1;
            }
        }
        // Block 14:
        ans += ")".repeat(l);
        // Block 15:
        System.out.println(ans);
        // Block END.
    }
    }
}
