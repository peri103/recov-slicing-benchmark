import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1234567876";
        // Block 2:
        double m = Double.POSITIVE_INFINITY;
        // Block 3:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 4:
            m = Math.min(m, Math.abs(753 - Integer.parseInt(S.substring(i, i + 3))));
        }
        // Block 5:
        System.out.println(m);
        // Block END.
    }
    }

