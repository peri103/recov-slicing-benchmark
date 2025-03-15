import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "xyz";
        // Block 2:
        int K = 4;
        // Block 3:
        int i = 0;
        // Block 4:
        String l = "";
        // Block 5:
        while (i < S.length() - 1) {
            // Block 6:
            if (S.charAt(i) == 'a') {
                // Block 7:
                l += 'a';
            }
            // Block 8:
            else if (123 - S.charAt(i) <= K) {
                // Block 9:
                l += 'a';
                // Block 10:
                K -= 123 - S.charAt(i);
            }
            // Block 11:
            else {
                // Block 12:
                l += S.charAt(i);
            }
            // Block 13:
            i++;
        }
        // Block 14:
        if (K > 0) {
            // Block 15:
            K %= 26;
            // Block 16:
            int n = S.charAt(S.length() - 1) + K;
            // Block 17:
            if (n > 122) {
                // Block 18:
                n -= 26;
            }
            // Block 19:
            l += (char) n;
        }
        // Block 20:
        else {
            // Block 21:
            l += S.charAt(S.length() - 1);
        }
        // Block 22:
        System.out.println(l);
        // Block END.
    }
    }

