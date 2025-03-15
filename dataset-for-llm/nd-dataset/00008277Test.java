import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 8, k = 3;
        // Block 2:
        k -= 1;
        // Block 3:
        int[] a = {7, 3, 1, 8, 4, 6, 2, 5};
        // Block 4:
        int i = n - 1;
        // Block 5:
        System.out.println(-(-i / k) - (-(n - i - 1) / k));
        // Block END.
    }
    }
}
