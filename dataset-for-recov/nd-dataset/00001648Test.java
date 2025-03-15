import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        int ans1 = Math.min(A, B);
        // Block 3:
        int ans2 = Math.max(A + B - N, 0);
        // Block 4:
        System.out.println(ans1 + " " + ans2);
        // Block END.
    }
    }

