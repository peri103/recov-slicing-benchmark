import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1234567876";
        // Block 2:
        int S_len = S.length();
        // Block 3:
        int ans = 1000;
        // Block 4:
        for (int i = 0; i < S_len - 2; i++) {
            // Block 5:
            int t = Integer.parseInt(S.substring(i, i + 3));
            // Block 6:
            int t_abs = Math.abs(t - 753);
            // Block 7:
            ans = Math.min(ans, t_abs);
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
    }

