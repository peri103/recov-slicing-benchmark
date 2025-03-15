import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int N = 100, A = 100, B = 100;
        // Block 2:
        if (N >= A + B) {
            // Block 3:
            System.out.println(Math.min(A, B) + " 0");
        // Block 4:
        } else {
            // Block 5:
            System.out.println(Math.min(A, B) + " " + (A + B - N));
        }
        // Block END.
    }
    }
}
