import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "35753";
        // Block 2:
        int min_v = 9999;
        // Block 3:
        for (int i = 0; i < s.length() - 2; i++) {
            // Block 4:
            int n = Integer.parseInt(s.substring(i, i + 3));
            // Block 5:
            min_v = Math.min(min_v, Math.abs(753 - n));
        }
        // Block 6:
        System.out.println(min_v);
        // Block END.
    }
    }

