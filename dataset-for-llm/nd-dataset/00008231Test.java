import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 3, k = 3;
        // Block 2:
        int[] a = {1, 2, 3};
        // Block 3:
        int ans = (n / k > 0) ? 1 : 0;
        // Block 4:
        int mod = (n - k) / (k - 1) + Math.min((n - k) % (k - 1), 1);
        // Block 5:
        System.out.println(ans + mod);
        // Block END.
    }
    }
}
