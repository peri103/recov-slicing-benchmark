import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 5;
        // Block 2:
        int[][] A = new int[2][];
        // Block 3:
        A[0] = new int[]{3, 2, 2, 4, 1};
        A[1] = new int[]{};
        // Block 4:
        A[1] = new int[]{1, 2, 2, 2, 1};
        // Block 5:
        int result = 0;
        // Block 6:
        for (int i = 0; i <= N; i++) {
            // Block 7:
            result = Math.max(sum(A[0], i) + sum(A[1], i - 1), result);
        }
        // Block 8:
        System.out.println(result);
        // Block END.
    }

    private static int sum(int[] array, int end) {
        int total = 0;
        for (int j = 0; j < end && j < array.length; j++) {
            total += array[j];
        }
        return total;
    }
    }

