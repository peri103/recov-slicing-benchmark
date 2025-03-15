import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1111111111";
        // Block 2:
        int num_len = 999;
        // Block 3:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 4:
            int X = Integer.parseInt(S.substring(i, i + 3));
            // Block 5:
            num_len = Math.min(num_len, Math.abs(753 - X));
        }
        // Block 6:
        System.out.println(num_len);
        // Block END.
    }
    }
}
