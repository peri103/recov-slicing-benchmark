import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "35753";
        // Block 2:
        int t = 1000;
        // Block 3:
        for (int s = 0; s < S.length() - 2; s++) {
            // Block 4:
            t = Math.min(Math.abs(753 - Integer.parseInt(S.substring(s, s + 3))), t);
        }
        // Block 5:
        System.out.println(t);
        // Block END.
    }
    }

