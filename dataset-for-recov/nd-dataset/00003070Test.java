import org.junit.jupiter.api.Test;

class _00003070Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1234567876";
        // Block 2:
        int ans = 642;
        // Block 3:
        for (int i = 0; i < s.length() - 2; i++) {
            // Block 4:
            if (ans > Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753)) {
                // Block 5:
                ans = Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753);
            }
            // Block 6:
            else {
                // Block 7:
                ans = ans;
            }
        }
        // Block 8:
        System.out.println(ans);
        // Block END.
    }
    }

