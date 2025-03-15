import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 12;
        // Block 2:
        if (n % 2 != 0) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int cnt = 0;
            // Block 6:
            n = n / 2;
            // Block 7:
            while (n > 0) {
                // Block 8:
                cnt = cnt + (n / 5);
                // Block 9:
                n = n / 5;
            }
            // Block 10:
            System.out.println(cnt);
        }
        // Block END.
    }
    }
}
