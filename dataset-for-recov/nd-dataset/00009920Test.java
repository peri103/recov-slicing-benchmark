import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 8;
        // Block 2:
        char[] S = {')', ')', ')', ')', '(', '(', '(', '('};
        // Block 3:
        StringBuilder ans = new StringBuilder();
        // Block 4:
        int count = 0;
        // Block 5:
        boolean addFlag = true;
        // Block 6:
        for (int i = 0; i < N; i++) {
            // Block 7:
            if (addFlag) {
                // Block 8:
                if (S[i] == ')') {
                    // Block 9:
                    ans.append(')');
                    // Block 10:
                    ans.insert(0, '(');
                // Block 11:
                } else {
                    // Block 12:
                    ans.append('(');
                    // Block 13:
                    count += 1;
                    // Block 14:
                    addFlag = false;
                }
            // Block 15:
            } else {
                // Block 16:
                if (S[i] == '(') {
                    // Block 17:
                    ans.append('(');
                    // Block 18:
                    count += 1;
                // Block 19:
                } else {
                    // Block 20:
                    ans.append(')');
                    // Block 21:
                    count -= 1;
                    // Block 22:
                    if (count == 0) {
                        // Block 23:
                        addFlag = true;
                    }
                }
            }
        }
        // Block 24:
        for (int j = 0; j < count; j++) {
            // Block 25:
            ans.append(')');
        }
        // Block 26:
        System.out.println(ans.toString());
        // Block END.
    }
    }

