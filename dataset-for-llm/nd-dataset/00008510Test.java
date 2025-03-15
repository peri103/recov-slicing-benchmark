import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int[] l1 = {3, 2, 2, 4, 1};
        // Block 3:
        int[] l2 = {1, 2, 2, 2, 1};
        // Block 4:
        int l1_sum = l1[0];
        // Block 5:
        int l2_sum = 0;
        for (int num : l2) {
            l2_sum += num;
        }
        // Block 6:
        int Max = l1_sum + l2_sum;
        // Block 7:
        for (int i = 1; i < N; i++) {
            // Block 8:
            l1_sum += l1[i];
            // Block 9:
            l2_sum -= l2[i - 1];
            // Block 10:
            if (Max < l1_sum + l2_sum) {
                // Block 11:
                Max = l1_sum + l2_sum;
            }
        }
        // Block 12:
        System.out.println(Max);
        // Block END.
    }
    }
}
