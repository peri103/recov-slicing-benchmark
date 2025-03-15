import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 111;
        // Block 2:
        while (true) {
            // Block 3:
            if (String.valueOf(n).chars().distinct().count() == 1) {
                // Block 4:
                System.out.println(n);
                // Block 5:
                break;
            }
            // Block 6:
            n += 1;
        }
        // Block END.
    }
    }

