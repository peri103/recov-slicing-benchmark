import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        char[] S = {')', ')', ')', '(', ')', ')'};
        // Block 3:
        int count = 0;
        // Block 4:
        int[] LR = {0, 0};
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            if (S[i] == '(') {
                // Block 7:
                count++;
            }
            // Block 8:
            else {
                // Block 9:
                if (count == 0) {
                    // Block 10:
                    LR[0]++;
                    // Block 11:
                    continue;
                }
                // Block 12:
                count--;
            }
        }
        // Block 13:
        LR[1] = count;
        // Block 14:
        for (int i = 0; i < 2; i++) {
            // Block 15:
            for (int j = 0; j < LR[i]; j++) {
                // Block 16:
                if (i == 0) {
                    // Block 17:
                    S = insertAtBeginning(S, '(');
                }
                // Block 18:
                else {
                    // Block 19:
                    S = appendAtEnd(S, ')');
                }
            }
        }
        // Block 20:
        System.out.println(String.valueOf(S));
        // Block END.
    }

    private static char[] insertAtBeginning(char[] arr, char value) {
        char[] newArr = new char[arr.length + 1];
        newArr[0] = value;
        System.arraycopy(arr, 0, newArr, 1, arr.length);
        return newArr;
    }

    private static char[] appendAtEnd(char[] arr, char value) {
        char[] newArr = new char[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = value;
        return newArr;
    }
    }
}
