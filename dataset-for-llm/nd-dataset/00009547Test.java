import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "2017/01/31";
        // Block 2:
        String s = "";
        // Block 3:
        for (int i = 0; i < 10; i++) {
            // Block 4:
            if (i == 3) {
                // Block 5:
                s += "8";
            }
            // Block 6:
            else {
                // Block 7:
                s += S.charAt(i);
            }
        }
        // Block 8:
        System.out.println(s);
        // Block END.
    }
    }
}
