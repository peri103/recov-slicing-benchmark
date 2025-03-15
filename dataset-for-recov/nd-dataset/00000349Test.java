import org.junit.jupiter.api.Test;

class _00000349Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "xyz";
        // Block 2:
        int k = 4;
        // Block 3:
        int lens = s.length();
        // Block 4:
        String alp = "azyxwvutsrqponmlkjihgfedcb";
        // Block 5:
        StringBuilder ans = new StringBuilder();
        // Block 6:
        for (int i = 0; i < lens; i++) {
            // Block 7:
            int d = alp.indexOf(s.charAt(i));
            // Block 8:
            if (k >= d) {
                // Block 9:
                k -= d;
                // Block 10:
                ans.append("a");
            }
            // Block 11:
            else {
                // Block 12:
                ans.append(s.charAt(i));
            }
        }
        // Block 13:
        char las = ans.charAt(ans.length() - 1);
        ans.deleteCharAt(ans.length() - 1);
        // Block 14:
        alp = "abcdefghijklmnopqrstuvwxyz";
        // Block 15:
        ans.append(alp.charAt((alp.indexOf(las) + k) % 26));
        // Block 16:
        System.out.println(ans.toString());
        // Block END.
    }
    }

