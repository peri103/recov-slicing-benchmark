import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 111;
        // Block 2:
        while (true) {
            // Block 3:
            String tmp = Integer.toString(n);
            // Block 4:
            if (tmp.charAt(0) == tmp.charAt(1) && tmp.charAt(1) == tmp.charAt(2)) {
                // Block 5:
                System.out.println(n);
                // Block 6:
                break;
            }
            // Block 7:
            else {
                // Block 8:
                n += 1;
            }
        }
        // Block END.
    }
    }

