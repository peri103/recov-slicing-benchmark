import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] S = {'x', 'y', 'z'};
        // Block 2:
        int K = 4;
        // Block 3:
        for (int i = 0; i < S.length; i++) {
            char s = S[i];
            // Block 4:
            if (s == 'a') {
                // Block 5:
                continue;
            }
            // Block 6:
            else if ('z' - s + 1 <= K) {
                // Block 7:
                S[i] = 'a';
                // Block 8:
                K -= 'z' - s + 1;
            }
        }
        // Block 9:
        K %= 26;
        // Block 10:
        S[S.length - 1] = (char) ((ord(S[S.length - 1]) - ord('a') + K) % 26 + ord('a'));
        // Block 11:
        System.out.println(String.valueOf(S));
        // Block END.
    }
    
    private static int ord(char c) {
        return (int) c;
    }
    }
}
