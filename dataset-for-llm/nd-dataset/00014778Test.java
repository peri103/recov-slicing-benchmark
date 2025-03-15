import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 1, p = 1;
        // Block 2:
        int[] a = {50};
        // Block 3:
        int[] cnt = new int[2];
        // Block 4:
        for (int num : a) {
            // Block 5:
            cnt[num % 2] += 1;
        }
        // Block 6:
        if (cnt[1] == 0) {
            // Block 7:
            if (p == 0) {
                // Block 8:
                System.out.println((int) Math.pow(2, n));
            }
            // Block 9:
            else {
                // Block 10:
                System.out.println(0);
            }
        }
        // Block 11:
        else {
            // Block 12:
            System.out.println((int) Math.pow(2, (n - 1)));
        }
        // Block END.
    }
    }
}
