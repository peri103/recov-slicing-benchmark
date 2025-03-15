import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] S = {'c', 'o', 'd', 'e', 'f', 'e', 's', 't', 'i', 'v', 'a', 'l'};
        // Block 2:
        int K = 100;
        // Block 3:
        int N = S.length;
        // Block 4:
        for (int i = 0; i < N; i++) {
            // Block 5:
            if (S[i] == 'a') {
                // Block 6:
                continue;
            }
            // Block 7:
            int sa = 'z' - S[i] + 1;
            // Block 8:
            if (sa <= K) {
                // Block 9:
                K -= sa;
                // Block 10:
                S[i] = 'a';
            }
        }
        // Block 11:
        if (K != 0) {
            // Block 12:
            K %= 26;
            // Block 13:
            S[N - 1] = (char) (S[N - 1] + K);
        }
        // Block 14:
        System.out.println(String.valueOf(S));
        // Block END.
    }
    }

