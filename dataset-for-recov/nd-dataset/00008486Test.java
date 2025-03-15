import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 4;
        // Block 2:
        int[] a = {1, 1, 1, 1};
        // Block 3:
        int[] b = {1, 1, 1, 1};
        // Block 4:
        int[] A = new int[N];
        // Block 5:
        int[] B = new int[N];
        // Block 6:
        int suma = 0;
        // Block 7:
        int sumb = 0;
        // Block 8:
        for (int n = 0; n < N; n++) {
            // Block 9:
            suma += a[n];
            // Block 10:
            A[n] = suma;
        }
        // Block 11:
        for (int n = N - 1; n >= 0; n--) {
            // Block 12:
            sumb += b[n];
            // Block 13:
            B[N - 1 - n] = sumb;
        }
        // Block 14:
        int MAX = 0;
        // Block 15:
        for (int n = 0; n < N; n++) {
            // Block 16:
            MAX = Math.max(MAX, A[n] + B[N - n - 1]);
        }
        // Block 17:
        System.out.println(MAX);
        // Block END.
    }
    }

