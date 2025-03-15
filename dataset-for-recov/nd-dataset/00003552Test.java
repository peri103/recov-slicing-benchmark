import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int A = 20, B = 30;
        // Block 2:
        B *= 2;
        // Block 3:
        if (A <= B) {
            // Block 4:
            System.out.println(0);
        // Block 5:
        } else {
            // Block 6:
            System.out.println(A - B);
        }
        // Block END.
    }
    }
}
