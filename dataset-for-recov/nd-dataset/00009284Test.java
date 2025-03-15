import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "2017/01/07";
        // Block 2:
        String ans = "";
        // Block 3:
        for (int i = 0; i < S.length(); i++) {
            // Block 4:
            if (i == 3) {
                // Block 5:
                ans += '8';
            }
            // Block 6:
            else {
                // Block 7:
                ans += S.charAt(i);
            }
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
    }
}
