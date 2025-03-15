import org.junit.jupiter.api.Test;

class _00000066Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int K = 4;
        // Block 3:
        String rlt = "";
        // Block 4:
        for (int i = 0; i < s.length() - 1; i++) {
            // Block 5:
            int c = (26 - (s.charAt(i) - 'a')) % 26;
            // Block 6:
            if (K >= c) {
                // Block 7:
                rlt += 'a';
                // Block 8:
                K -= c;
            }
            // Block 9:
            else {
                // Block 10:
                rlt += s.charAt(i);
            }
        }
        // Block 11:
        rlt += (char) ((K + (s.charAt(s.length() - 1) - 'a')) % 26 + 'a');
        // Block 12:
        System.out.println(rlt);
        // Block END.
    }
    }

