import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 4;
        // Block 2:
        int[] A1 = {1, 1, 1, 1};
        // Block 3:
        int[] A2 = {1, 1, 1, 1};
        // Block 4:
        java.util.List<Integer> candies = new java.util.ArrayList<>();
        // Block 5:
        for (int i = 0; i < N; i++) {
            // Block 6:
            int sumA1 = 0;
            for (int j = 0; j <= i; j++) {
                sumA1 += A1[j];
            }
            int sumA2 = 0;
            for (int j = i; j < N; j++) {
                sumA2 += A2[j];
            }
            candies.add(sumA1 + sumA2);
        }
        // Block 7:
        System.out.println(java.util.Collections.max(candies));
        // Block END.
    }
    }
}
