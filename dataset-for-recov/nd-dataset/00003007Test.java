import org.junit.jupiter.api.Test;

class _00003007Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "35753";
        // Block 2:
        int ans = 1000;
        // Block 3:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 4:
            int t = Math.abs(Integer.parseInt(S.substring(i, i + 3)) - 753);
            // Block 5:
            if (t < ans) {
                // Block 6:
                ans = t;
            }
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

