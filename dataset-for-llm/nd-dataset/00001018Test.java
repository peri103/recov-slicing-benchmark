import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 112;
        // Block 2:
        String S = String.valueOf(N);
        // Block 3:
        int x = Integer.parseInt(String.valueOf(S.charAt(0)));
        // Block 4:
        int y = Integer.parseInt(String.valueOf(S.charAt(1)));
        // Block 5:
        int z = Integer.parseInt(String.valueOf(S.charAt(2)));
        // Block 6:
        int ans;
        if (x > y) {
            // Block 7:
            ans = x * 100 + x * 10 + x;
        // Block 8:
        } else if (x < y) {
            // Block 9:
            x += 1;
            // Block 10:
            ans = x * 100 + x * 10 + x;
        // Block 11:
        } else {
            // Block 12:
            if (x > z) {
                // Block 13:
                ans = x * 100 + x * 10 + x;
            // Block 14:
            } else if (x < z) {
                // Block 15:
                x += 1;
                // Block 16:
                ans = x * 100 + x * 10 + x;
            // Block 17:
            } else {
                // Block 18:
                ans = N;
            }
        }
        // Block 19:
        System.out.println(ans);
        // Block END.
    }
    }
}
