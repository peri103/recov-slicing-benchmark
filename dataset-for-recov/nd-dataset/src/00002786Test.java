import org.junit.jupiter.api.Test;

class _00002786Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "35753";
        // Block 2:
        int ans = 1000;
        // Block 3:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 4:
            int x = Integer.parseInt(S.substring(i, i + 3));
            // Block 5:
            int dif = Math.abs(753 - x);
            // Block 6:
            ans = Math.min(dif, ans);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

