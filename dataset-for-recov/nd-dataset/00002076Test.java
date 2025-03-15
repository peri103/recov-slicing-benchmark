import org.junit.jupiter.api.Test;

class _00002076Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        int[] check = new int[N];
        // Block 3:
        for (int i = 0; i < A; i++) {
            // Block 4:
            check[i] += 1;
        }
        // Block 5:
        for (int i = 0; i < B; i++) {
            // Block 6:
            check[N - (i + 1)] += 1;
        }
        // Block 7:
        int cnt = 0;
        // Block 8:
        for (int c : check) {
            // Block 9:
            if (c == 2) {
                // Block 10:
                cnt += 1;
            }
        }
        // Block 11:
        System.out.println(Math.min(A, B) + " " + cnt);
        // Block END.
    }
    }

