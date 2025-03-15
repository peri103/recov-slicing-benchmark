import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1111111111";
        double m = Double.POSITIVE_INFINITY;
        // Block 2:
        for (int i = 0; i < s.length() - 2; i++) {
            m = Math.min(m, Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753));
        }
        // Block 3:
        System.out.println(m);
        // Block END.
    }
    }

