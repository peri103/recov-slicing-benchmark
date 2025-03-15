import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1234567876";
        // Block 2:
        int n = S.length();
        // Block 3:
        int res = 1000000;
        // Block 4:
        for (int i = 0; i < n - 2; i++) {
            // Block 5:
            int s = Integer.parseInt(S.substring(i, i + 3));
            // Block 6:
            res = Math.min(res, Math.abs(s - 753));
        }
        // Block 7:
        System.out.println(res);
        // Block END.
    }
    }

