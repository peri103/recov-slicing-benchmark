import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3;
        // Block 2:
        String s = "())";
        // Block 3:
        int nopen = 0;
        // Block 4:
        String sl = "";
        // Block 5:
        String sr = "";
        // Block 6:
        for (char c : s.toCharArray()) {
            // Block 7:
            if (c == '(') {
                // Block 8:
                nopen += 1;
            }
            // Block 9:
            else {
                // Block 10:
                if (nopen == 0) {
                    // Block 11:
                    sl += '(';
                }
                // Block 12:
                else {
                    // Block 13:
                    nopen -= 1;
                }
            }
        }
        // Block 14:
        nopen = 0;
        for (char c : (sl + s).toCharArray()) {
            nopen += (c == '(') ? 1 : -1;
        }
        // Block 15:
        sr = new String(new char[nopen]).replace("\0", ")");
        // Block 16:
        System.out.println(sl + s + sr);
        // Block END.
    }
    }

