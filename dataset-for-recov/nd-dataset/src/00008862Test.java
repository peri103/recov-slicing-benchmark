import org.junit.jupiter.api.Test;

class _00008862Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 1;
        // Block 2:
        int[] U = {2};
        // Block 3:
        int[] D = {3};
        // Block 4:
        int[] U_reversed = new int[N];
        for (int i = 0; i < N; i++) {
            U_reversed[i] = U[N - 1 - i];
        }
        U = U_reversed;
        // Block 5:
        int[] D_reversed = new int[N];
        for (int i = 0; i < N; i++) {
            D_reversed[i] = D[N - 1 - i];
        }
        D = D_reversed;
        // Block 6:
        int up = 0;
        // Block 7:
        int down = 0;
        // Block 8:
        int[] upper = new int[N + 1];
        upper[0] = 0;
        // Block 9:
        int[] downer = new int[N];
        // Block 10:
        for (int i = 0; i < N; i++) {
            // Block 11:
            up += U[i];
            // Block 12:
            down += D[i];
            // Block 13:
            upper[i + 1] = up;
            // Block 14:
            downer[i] = down;
        }
        // Block 15:
        int[] upper_reversed = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            upper_reversed[i] = upper[N - i];
        }
        upper = upper_reversed;
        // Block 16:
        int[] downer_reversed = new int[N];
        for (int i = 0; i < N; i++) {
            downer_reversed[i] = downer[N - 1 - i];
        }
        downer = downer_reversed;
        // Block 17:
        int ans = 0;
        // Block 18:
        for (int i = 0; i < N; i++) {
            // Block 19:
            int ret = upper[0] - upper[i + 1] + downer[i];
            // Block 20:
            ans = Math.max(ans, ret);
        }
        // Block 21:
        System.out.println(ans);
        // Block END.
    }
    }

