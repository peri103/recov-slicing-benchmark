import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] S = {'c', 'o', 'd', 'e', 'f', 'e', 's', 't', 'i', 'v', 'a', 'l'};
        // Block 2:
        int K = 100;
        // Block 3:
        for (int i = 0; i < S.length; i++) {
            // Block 4:
            if (S[i] == 'a') {
                // Block 5:
                continue;
            }
            // Block 6:
            int d = 'z' - S[i] + 1;
            // Block 7:
            if (K >= d) {
                // Block 8:
                S[i] = 'a';
                // Block 9:
                K -= d;
            }
        }
        // Block 10:
        if (K > 0) {
            // Block 11:
            int j = S[S.length - 1] + K % 26;
            // Block 12:
            S[S.length - 1] = (char) j;
        }
        // Block 13:
        System.out.println(String.valueOf(S));
        // Block END.
    }
    }
}
