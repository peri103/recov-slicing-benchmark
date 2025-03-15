import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 1;
        // Block 2:
        int[] A1 = {2};
        // Block 3:
        int[] A2 = {3};
        // Block 4:
        int max_drop = 0;
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            int sumA1 = 0;
            for (int j = 0; j <= i; j++) {
                sumA1 += A1[j];
            }
            int sumA2 = 0;
            for (int j = i; j < A2.length; j++) {
                sumA2 += A2[j];
            }
            max_drop = Math.max(max_drop, sumA1 + sumA2);
        }
        // Block 7:
        System.out.println(max_drop);
        // Block END.
    }
    }
}
