import org.junit.jupiter.api.Test;

class _00001672Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int rmax = Math.min(A, B);
        // Block 3:
        int rmin = Math.max(0, A + B - N);
        // Block 4:
        System.out.println(rmax + " " + rmin);
        // Block END.
    }
    }

