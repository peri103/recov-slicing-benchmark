import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int A = 20, B = 15;
        // Block 2:
        int x;
        if (A <= 2 * B) {
            // Block 3:
            x = 0;
        } 
        // Block 4:
        else {
            x = A - 2 * B;
        }
        // Block 5:
        System.out.println(x);
        // Block END.
    }
    }

