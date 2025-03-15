import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 7;
        // Block 2:
        int[] A1 = {3, 3, 4, 5, 4, 5, 3};
        // Block 3:
        int[] A2 = {5, 3, 4, 4, 2, 3, 2};
        // Block 4:
        for (int j = 0; j < A2.length / 2; j++) {
            int temp = A2[j];
            A2[j] = A2[A2.length - 1 - j];
            A2[A2.length - 1 - j] = temp;
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

