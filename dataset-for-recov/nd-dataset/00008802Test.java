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
        java.util.List<Integer> ans = new java.util.ArrayList<>();
        // Block 5:
        for (int n = 0; n < N; n++) {
            // Block 6:
            int ame = 0;
            // Block 7:
            for (int i = 0; i <= n; i++) {
                // Block 8:
                ame += A1[i];
            }
            // Block 9:
            for (int j = n; j < N; j++) {
                // Block 10:
                ame += A2[j];
            }
            // Block 11:
            ans.add(ame);
        }
        // Block 12:
        System.out.println(java.util.Collections.max(ans));
        // Block END.
    }
    }

