import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 4;
        // Block 2:
        int[] al = {1, 1, 1, 1};
        // Block 3:
        int[] bl = {1, 1, 1, 1};
        // Block 4:
        int res = 0;
        // Block 5:
        for (int i = 1; i <= n; i++) {
            // Block 6:
            int aa = 0;
            for (int j = 0; j < i; j++) {
                aa += al[j];
            }
            // Block 7:
            int bb = 0;
            for (int j = i - 1; j < n; j++) {
                bb += bl[j];
            }
            // Block 8:
            res = Math.max(res, aa + bb);
        }
        // Block 9:
        System.out.println(res);
        // Block END.
    }
    }
}
