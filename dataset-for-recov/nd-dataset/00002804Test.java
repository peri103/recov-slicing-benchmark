import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "35753";
        // Block 2:
        int min_val = 1000000000;
        // Block 3:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 4:
            int temp = Math.abs(753 - Integer.parseInt(S.substring(i, i + 3)));
            // Block 5:
            min_val = Math.min(min_val, temp);
        }
        // Block 6:
        System.out.println(min_val);
        // Block END.
    }
    }

