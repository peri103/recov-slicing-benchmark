import org.junit.jupiter.api.Test;

class _00002782Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1234567876";
        // Block 2:
        int ans = 753;
        // Block 3:
        for (int i = 0; i <= s.length() - 3; i++) {
            // Block 4:
            ans = Math.min(Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753), ans);
        }
        // Block 5:
        System.out.println(ans);
        // Block END.
    }
    }

