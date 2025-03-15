import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int[] A = {0, 100};
        // Block 3:
        double diff = Double.POSITIVE_INFINITY;
        // Block 4:
        int ans = 0;
        // Block 5:
        for (int a : java.util.Arrays.copyOfRange(A, 0, A.length - 1)) {
            // Block 6:
            double d = Math.abs(a - A[A.length - 1] / 2.0);
            // Block 7:
            if (d < diff) {
                // Block 8:
                ans = a;
                // Block 9:
                diff = d;
            }
        }
        // Block 10:
        System.out.println(A[A.length - 1] + " " + ans);
        // Block END.
    }
    }
}
