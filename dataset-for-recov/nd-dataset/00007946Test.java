import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 4, k = 3;
        // Block 2:
        int[] a = {2, 3, 1, 4};
        // Block 3:
        int cnt;
        if (n == k) {
            // Block 4:
            cnt = 1;
        } else {
            // Block 5:
            cnt = (n - 2) / (k - 1) + 1;
        }
        // Block 7:
        System.out.println(cnt);
        // Block END.
    }
    }
}
