import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "a";
        // Block 2:
        int k = 25;
        // Block 3:
        StringBuilder sl = new StringBuilder();
        // Block 4:
        int n = s.length();
        // Block 5:
        for (int i = 0; i < n; i++) {
            // Block 6:
            if (s.charAt(i) != 'a') {
                // Block 7:
                if (26 - (s.charAt(i) - 'a') <= k) {
                    // Block 8:
                    sl.append('a');
                    // Block 9:
                    k -= 26 - (s.charAt(i) - 'a');
                }
                // Block 10:
                else {
                    // Block 11:
                    sl.append(s.charAt(i));
                }
            }
            // Block 12:
            else {
                // Block 13:
                sl.append(s.charAt(i));
            }
        }
        // Block 14:
        if (k > 0) {
            // Block 15:
            if (k % 26 != 0) {
                // Block 16:
                sl.setCharAt(n - 1, (char) (sl.charAt(n - 1) + k % 26));
            }
        }
        // Block 17:
        System.out.println(sl.toString());
        // Block END.
    }
    }

