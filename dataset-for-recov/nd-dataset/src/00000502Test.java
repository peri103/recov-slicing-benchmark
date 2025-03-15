import java.util.Scanner;
import org.junit.jupiter.api.Test;

class _00000502Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        Scanner stdin = new Scanner(System.in);
        // Block 2:
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        // Block 3:
        int[] nokori = new int[26];
        for (int i = 0; i < 26; i++) {
            nokori[i] = 26 - i;
        }
        nokori[0] = 0;
        // Block 4:
        String s = "a";
        // Block 5:
        int k = 25;
        // Block 6:
        String sin = "";
        // Block 7:
        for (char i : s.toCharArray()) {
            // Block 8:
            if (nokori[alpha.indexOf(i)] <= k) {
                // Block 9:
                k -= nokori[alpha.indexOf(i)];
                // Block 10:
                sin += "a";
            // Block 11:
            } else {
                // Block 12:
                sin += i;
            }
        }
        // Block 13:
        int q = alpha.indexOf(sin.charAt(sin.length() - 1));
        // Block 14:
        q += k;
        // Block 15:
        System.out.println(sin.substring(0, sin.length() - 1) + alpha.charAt(q % 26));
        // Block END.
    }
    }

