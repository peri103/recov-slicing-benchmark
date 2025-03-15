import org.junit.jupiter.api.Test;

class _00002856Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1111111111";
        // Block 2:
        int n = s.length();
        // Block 3:
        int ans = Integer.MAX_VALUE;
        // Block 4:
        for (int i = 0; i < n - 2; i++) {
            // Block 5:
            ans = Math.min(ans, Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753));
        }
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }

