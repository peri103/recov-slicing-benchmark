import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String s = "a";
        // Block 2:
        int x = 25;
        // Block 3:
        int[] tank = new int[s.length()];
        // Block 4:
        for (char c : s.toCharArray()) {
            // Block 5:
            if (c == 'a') {
                // Block 6:
                tank[tank.length - 1] = 0;
            }
            // Block 7:
            else {
                // Block 8:
                tank[tank.length - 1] = ('z' + 1 - c);
            }
        }
        // Block 9:
        String res = "";
        // Block 10:
        for (int i = 0; i < tank.length; i++) {
            // Block 11:
            if (tank[i] == 0) {
                // Block 12:
                res += s.charAt(i);
            }
            // Block 13:
            else if (tank[i] <= x) {
                // Block 14:
                x -= tank[i];
                // Block 15:
                tank[i] = 0;
                // Block 16:
                res += 'a';
            }
            // Block 17:
            else {
                // Block 18:
                res += s.charAt(i);
            }
        }
        // Block 19:
        char c = res.charAt(res.length() - 1);
        // Block 20:
        x %= 26;
        // Block 21:
        if (c + x <= 'z') {
            // Block 22:
            res = res.substring(0, res.length() - 1) + (char) (c + x);
        }
        // Block 23:
        else {
            // Block 24:
            res = res.substring(0, res.length() - 1) + (char) (c + x - 'z' + 'a' - 1);
        }
        // Block 25:
        System.out.println(res);
        // Block END.
    }
    }

