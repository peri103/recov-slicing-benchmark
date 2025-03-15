import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "level";
        // Block 2:
        int n = s.length();
        // Block 3:
        String ans = "No";
        // Block 4:
        int cnt = 0;
        // Block 5:
        if (s.equals(new StringBuilder(s).reverse().toString())) {
            // Block 6:
            cnt += 1;
        }
        // Block 7:
        if (s.substring(0, (n - 1) / 2).equals(new StringBuilder(s.substring((n - 1) / 2 - 1, -1)).reverse().toString())) {
            // Block 8:
            cnt += 1;
        }
        // Block 9:
        if (s.substring((n + 1) / 2).equals(new StringBuilder(s.substring(0, (n - 1) / 2)).reverse().toString())) {
            // Block 10:
            cnt += 1;
        }
        // Block 11:
        if (cnt == 3) {
            // Block 12:
            ans = "Yes";
        }
        // Block 13:
        System.out.println(ans);
        // Block END.
    }
    }
}
