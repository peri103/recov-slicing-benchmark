import org.junit.jupiter.api.Test;

class _00003079Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1234567876";
        // Block 2:
        int n = s.length();
        // Block 3:
        int ans = 753;
        // Block 4:
        for (int i = 0; i < n - 2; i++) {
            // Block 5:
            int t = Integer.parseInt(s.substring(i, i + 3));
            // Block 6:
            ans = Math.min(ans, Math.abs(753 - t));
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

