import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int A = 12, B = 4;
        // Block 2:
        if (A > 2 * B) {
            System.out.println(A - 2 * B);
        }
        // Block 3:
        else {
            System.out.println(0);
        }
        // Block END.
    }
    }
}
