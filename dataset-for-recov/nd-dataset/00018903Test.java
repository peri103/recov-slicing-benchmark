import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 12;
        // Block 2:
        if (n % 2 == 1) {
            // Block 3:
            System.out.println(0);
            // Block 4:
            System.exit(0);
        }
        // Block 5:
        int mp = 0, tmp = 0; 
        // Block 6:
        while (true) {
            // Block 7:
            if (Math.pow(5, tmp) > n) {
                // Block 8:
                break;
            }
            // Block 9:
            mp = tmp; 
            // Block 10:
            tmp += 1;
        }
        // Block 11:
        int ans = 0; 
        // Block 12:
        for (int i = 1; i <= mp; i++) {
            // Block 13:
            ans += n / (2 * (int)Math.pow(5, i));
        }
        // Block 14:
        System.out.println(ans);
        // Block END.
    }
    }
}
