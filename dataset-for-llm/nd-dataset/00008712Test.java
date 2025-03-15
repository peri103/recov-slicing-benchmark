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
        for (int i = 0; i < A2.length / 2; i++) {
            int temp = A2[i];
            A2[i] = A2[A2.length - 1 - i];
            A2[A2.length - 1 - i] = temp;
        }
        // Block 5:
        for (int i = 0; i < N - 1; i++) {
            // Block 6:
            A1[i + 1] += A1[i];
            // Block 7:
            A2[i + 1] += A2[i];
        }
        // Block 8:
        int ans = 0;
        // Block 9:
        for (int i = 0; i < N; i++) {
            // Block 10:
            ans = Math.max(ans, A1[i] + A2[N - 1 - i]);
        }
        // Block 11:
        System.out.println(ans);
        // Block END.
    }
    }
}
