import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        long s = 999999999;
        // Block 2:
        if (s % 2 == 0) {
            // Block 3:
            System.out.println((int) s);
        }
        // Block 4:
        else {
            // Block 5:
            System.out.println((int) (s * 2));
        }
        // Block END.
    }
    }

