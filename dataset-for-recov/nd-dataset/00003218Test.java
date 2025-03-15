import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1111111111";
        // Block 2:
        int r = 1000;
        // Block 3:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 4:
            r = Math.min(r, Math.abs(Integer.parseInt(S.substring(i, i + 3)) - 753));
        }
        // Block 5:
        System.out.println(r);
        // Block END.
    }
    }

