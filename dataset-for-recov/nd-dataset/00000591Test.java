import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String S = "xyz";
        // Block 2:
        int K = 4;
        // Block 3:
        String ans = "";
        // Block 4:
        for (char s : S.toCharArray()) {
            // Block 5:
            int to_a_cost = (26 - (s - 'a')) % 26;
            // Block 6:
            if (to_a_cost <= K) {
                // Block 7:
                ans += 'a';
                // Block 8:
                K -= to_a_cost;
            }
            // Block 9:
            else {
                // Block 10:
                ans += s;
            }
        }
        // Block 11:
        if (K > 0) {
            // Block 12:
            K %= 26;
            // Block 13:
            ans = ans.substring(0, ans.length() - 1) + (char) ('a' + (((ans.charAt(ans.length() - 1) - 'a') + K) % 26));
        }
        // Block 14:
        System.out.println(ans);
        // Block END.
    }
    }
}
