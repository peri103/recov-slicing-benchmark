import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "codefestival";
        // Block 2:
        int K = 100;
        // Block 3:
        int[] S = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            S[i] = s.charAt(i) - 'a';
        }
        // Block 4:
        int last = K;
        // Block 5:
        for (int i = 0; i < S.length; i++) {
            // Block 6:
            if (S[i] != 0) {
                // Block 7:
                if (26 - S[i] <= last) {
                    // Block 8:
                    last -= 26 - S[i];
                    // Block 9:
                    S[i] = 0;
                }
            }
        }
        // Block 10:
        if (last > 0) {
            // Block 11:
            S[S.length - 1] += last;
            // Block 12:
            S[S.length - 1] %= 26;
        }
        // Block 13:
        StringBuilder result = new StringBuilder();
        for (int i : S) {
            result.append((char) (i + 'a'));
        }
        // Block 14:
        System.out.println(result.toString());
        // Block END.
    }
    }
}
