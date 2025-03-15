import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1111111111";
        // Block 2:
        int ans = Math.abs(753 - Integer.parseInt(S.substring(0, 3)));
        // Block 3:
        for (int i = 1; i < S.length() - 2; i++) {
            // Block 4:
            int tmp = Integer.parseInt(S.substring(i, i + 3));
            // Block 5:
            ans = Math.min(Math.abs(753 - tmp), ans);
        }
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }
}
