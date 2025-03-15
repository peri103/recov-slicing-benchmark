import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        String n = "5";
        // Block 2:
        int m = n.length();
        // Block 3:
        n = Integer.parseInt(n);
        // Block 4:
        if (n % 2 == 1) {
            // Block 5:
            System.out.println(0);
        } 
        // Block 6:
        else {
            // Block 7:
            if (m == 1) {
                // Block 8:
                System.out.println(0);
            } 
            // Block 9:
            else {
                // Block 10:
                int ans = 0;
                // Block 11:
                int i = 1;
                // Block 12:
                while (true) {
                    // Block 13:
                    int ans_plus = n / (2 * (int) Math.pow(5, i));
                    // Block 14:
                    if (ans_plus == 0) {
                        // Block 15:
                        break;
                    }
                    // Block 16:
                    ans += ans_plus;
                    // Block 17:
                    i += 1;
                }
                // Block 18:
                System.out.println(ans);
            }
        }
        // Block END.
    }
    }
}
