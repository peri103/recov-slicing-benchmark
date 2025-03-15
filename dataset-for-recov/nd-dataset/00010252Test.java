import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 8;
        // Block 2:
        String s = "))))((((";
        // Block 3:
        String ans = s;
        // Block 4:
        while (s.length() - s.replace("()", "").length() > 0) {
            // Block 5:
            s = s.replace("()", "");
        }
        // Block 6:
        int cnt_l = s.length() - s.replace(")", "").length();
        // Block 7:
        int cnt_r = s.length() - s.replace("(", "").length();
        // Block 8:
        ans = cnt_l * "(" + ans;
        // Block 9:
        ans += cnt_r * ")";
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

