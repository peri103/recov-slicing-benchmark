import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "35753";
        // Block 2:
        int ans = 999;
        // Block 3:
        for (int i = 0; i < s.length() - 2; i++) {
            // Block 4:
            int x = Integer.parseInt(s.substring(i, i + 3));
            // Block 5:
            int diff = Math.abs(753 - x);
            // Block 6:
            ans = Math.min(diff, ans);
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }
}
