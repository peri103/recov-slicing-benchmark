import org.junit.jupiter.api.Test;

class _00019299Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 12;
        // Block 2:
        int ans = 0;
        // Block 3:
        if (n % 2 == 1) {
            // Block 4:
            ans = 0;
        } 
        // Block 5:
        else {
            // Block 6:
            int tmp = 10;
            // Block 7:
            while (tmp <= n) {
                // Block 8:
                ans += n / tmp;
                // Block 9:
                tmp *= 5;
            }
        }
        // Block 10:
        System.out.println(ans);
        // Block END.
    }
    }

