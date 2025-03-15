import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 111;
        // Block 2:
        int[] l = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        // Block 3:
        for (int i = 0; i < l.length; i++) {
            // Block 4:
            if (n <= l[i]) {
                // Block 5:
                System.out.println(l[i]);
                // Block 6:
                break;
            }
        }
        // Block END.
    }
    }

