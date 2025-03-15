import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        char[] s = {'c', 'o', 'd', 'e', 'f', 'e', 's', 't', 'i', 'v', 'a', 'l'};
        // Block 2:
        int K = 100;
        // Block 3:
        for (int i = 0; i < s.length - 1; i++) {
            // Block 4:
            if (s[i] != 'a') {
                // Block 5:
                int a = 'z' + 1 - s[i];
                // Block 6:
                if (K >= a) {
                    // Block 7:
                    s[i] = 'a';
                    // Block 8:
                    K -= a;
                }
            }
        }
        // Block 9:
        if (K > 0) {
            // Block 10:
            s[s.length - 1] = (char) ((K + s[s.length - 1] - 'a') % ('z' - 'a' + 1) + 'a');
        }
        // Block 11:
        System.out.println(String.valueOf(s));
        // Block END.
    }
    }

