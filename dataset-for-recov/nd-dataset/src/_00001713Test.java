import org.junit.jupiter.api.Test;

class _00001713Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 10, A = 7, B = 5;
        // Block 2:
        int mx = Math.min(A, B);
        // Block 3:
        int mn = Math.max(A + B - N, 0);
        // Block 4:
        System.out.println(mx + " " + mn);
        // Block END.
    }
    }

