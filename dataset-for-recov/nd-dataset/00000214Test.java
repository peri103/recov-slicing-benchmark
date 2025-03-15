import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "codefestival";
        // Block 2:
        int k = 100;
        // Block 3:
        int slen = s.length();
        // Block 4:
        String new_s = "";
        // Block 5:
        for (int i = 0; i < slen; i++) {
            // Block 6:
            int val = ('z' + 1 - s.charAt(i)) % 26;
            // Block 7:
            if (k >= val) {
                // Block 8:
                k -= val;
                // Block 9:
                new_s += "a";
            }
            // Block 10:
            else {
                // Block 11:
                new_s += s.charAt(i);
            }
        }
        // Block 12:
        if (k > 0) {
            // Block 13:
            int tmp_val = new_s.charAt(slen - 1) + k % 26;
            // Block 14:
            if (tmp_val > 'z') {
                // Block 15:
                tmp_val -= 26;
            }
            // Block 16:
            new_s = new_s.substring(0, slen - 1) + (char) tmp_val;
        }
        // Block 17:
        System.out.println(new_s);
        // Block END.
    }
    }

