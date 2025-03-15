import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 8;
        // Block 2:
        char[] S = {')', ')', ')', ')', '(', '(', '(', '('};
        // Block 3:
        int f = 0;
        // Block 4:
        int b = 0;
        // Block 5:
        int count = 0;
        // Block 6:
        for (int i = N - 1; i >= 0; i--) {
            // Block 7:
            if (S[i] == '(') {
                // Block 8:
                if (count > 0) {
                    // Block 9:
                    count--;
                }
                // Block 10:
                else {
                    // Block 11:
                    b++;
                }
            }
            // Block 12:
            else {
                // Block 13:
                count++;
            }
        }
        // Block 14:
        for (int j = 0; j < count; j++) {
            System.out.print('(');
        }
        // Block 15:
        System.out.print(String.valueOf(S));
        // Block 16:
        for (int j = 0; j < b; j++) {
            System.out.print(')');
        }
        // Block END.
    }
    }

