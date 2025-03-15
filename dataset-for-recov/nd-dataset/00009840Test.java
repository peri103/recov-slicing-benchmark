import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3;
        // Block 2:
        char[] s = {'(', ')', ')'};
        // Block 3:
        int ins = 0;
        // Block 4:
        int app = 0;
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            if (s[i] == '(') {
                // Block 7:
                app += 1;
            }
            // Block 8:
            else {
                // Block 9:
                if (app > 0) {
                    // Block 10:
                    app -= 1;
                }
                // Block 11:
                else {
                    // Block 12:
                    ins += 1;
                }
            }
        }
        // Block 13:
        char[] inL = new char[ins];
        for (int j = 0; j < ins; j++) {
            inL[j] = '(';
        }
        // Block 14:
        char[] appArr = new char[app];
        for (int j = 0; j < app; j++) {
            appArr[j] = ')';
        }
        // Block 15:
        char[] ans = new char[inL.length + s.length + appArr.length];
        System.arraycopy(inL, 0, ans, 0, inL.length);
        System.arraycopy(s, 0, ans, inL.length, s.length);
        System.arraycopy(appArr, 0, ans, inL.length + s.length, appArr.length);
        // Block 16:
        System.out.println(String.valueOf(ans));
        // Block END.
    }
    }

