import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "1111111111";
        // Block 2:
        int ans = 1000;
        // Block 3:
        for (int i = 0; i < s.length() - 2; i++) {
            // Block 4:
            int num = Math.abs(753 - Integer.parseInt(s.substring(i, i + 3)));
            // Block 5:
            ans = Math.min(ans, num);
        }
        // Block 6:
        System.out.println(ans);
        // Block END.
    }
    }
}
