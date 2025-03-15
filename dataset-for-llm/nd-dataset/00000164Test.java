import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int k = 4;
        // Block 3:
        int n = s.length();
        // Block 4:
        char[] sArray = new char[n];
        for (int i = 0; i < n; i++) {
            sArray[i] = s.charAt(i);
        }
        // Block 5:
        int[] l = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // Block 6:
        for (int i = 0; i < n; i++) {
            // Block 7:
            char c = sArray[i];
            // Block 8:
            if (c == 'a') {
                // Block 9:
                continue;
            }
            // Block 10:
            if (l[c - 'a'] > k) {
                // Block 11:
                continue;
            }
            // Block 12:
            k -= l[c - 'a'];
            // Block 13:
            sArray[i] = 'a';
        }
        // Block 14:
        if (k > 0) {
            // Block 15:
            k = k % 26;
            // Block 16:
            char c = sArray[n - 1];
            // Block 17:
            for (int j = 0; j < 26; j++) {
                // Block 18:
                if (l[j] == l[c - 'a'] - k) {
                    // Block 19:
                    sArray[n - 1] = (char) ('a' + j);
                }
            }
        }
        // Block 20:
        String result = new String(sArray);
        // Block 21:
        System.out.println(result);
        // Block END.
    }
    }
}
