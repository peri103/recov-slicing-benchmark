import org.junit.jupiter.api.Test;

class _00002841Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1111111111";
        // Block 2:
        int ans = 999;
        // Block 3:
        for (int s = 0; s < S.length() - 2; s++) {
            // Block 4:
            ans = Math.min(Math.abs(753 - Integer.parseInt(S.substring(0, 3))), ans);
            // Block 5:
            S = S.substring(1);
        }
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }

