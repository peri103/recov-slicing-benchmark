import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 6;
        // Block 2:
        String S = ")))(())";
        // Block 3:
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = S.charAt(i) == '(' ? 1 : -1;
        }
        // Block 4:
        int l = 0, l_min = 0;
        // Block 5:
        int r = 0, r_min = 0;
        // Block 6:
        for (int i = 0; i < N; i++) {
            // Block 7:
            l += T[i];
            // Block 8:
            l_min = Math.min(l_min, l);
            // Block 9:
            r -= T[N - i - 1];
            // Block 10:
            r_min = Math.min(r_min, r);
        }
        // Block 11:
        String result = "(".repeat(-l_min) + S + ")".repeat(-r_min);
        System.out.println(result);
        // Block END.
    }
    }
}
