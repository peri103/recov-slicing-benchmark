import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "1234567876";
        // Block 2:
        int ans = 999;
        // Block 3:
        for (int i = 0; i < S.length() - 2; i++) {
            // Block 4:
            int num = Integer.parseInt(S.substring(i, i + 3));
            // Block 5:
            if (Math.abs(num - 753) < ans) {
                // Block 6:
                ans = Math.abs(num - 753);
            }
        }
        // Block 7:
        System.out.println(ans);
        // Block END.
    }
    }

