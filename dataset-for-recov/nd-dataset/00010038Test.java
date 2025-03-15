import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        char[] S = {')', ')', ')', '(', ')', ')'};
        // Block 3:
        int[] c = {0, 0};
        // Block 4:
        for (char s : S) {
            // Block 5:
            if (s == '(') {
                // Block 6:
                c[0] += 1;
            }
            // Block 7:
            else {
                // Block 8:
                if (c[0] > 0) {
                    // Block 9:
                    c[0] -= 1;
                }
                // Block 10:
                else {
                    // Block 11:
                    c[1] += 1;
                }
            }
        }
        // Block 12:
        char[] pre = new char[c[1]];
        for (int i = 0; i < c[1]; i++) {
            pre[i] = '(';
        }
        // Block 13:
        char[] rear = new char[c[0]];
        for (int i = 0; i < c[0]; i++) {
            rear[i] = ')';
        }
        // Block 14:
        char[] ans = new char[pre.length + S.length + rear.length];
        System.arraycopy(pre, 0, ans, 0, pre.length);
        System.arraycopy(S, 0, ans, pre.length, S.length);
        System.arraycopy(rear, 0, ans, pre.length + S.length, rear.length);
        // Block 15:
        System.out.println(String.valueOf(ans));
        // Block END.
    }
    }
}
