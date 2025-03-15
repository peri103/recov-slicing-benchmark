import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int m1 = 11, d1 = 30;
        // Block 2:
        int m2 = 12, d2 = 1;
        // Block 3:
        if (m1 != 12) {
            // Block 4:
            if (m2 == m1 + 1) {
                // Block 5:
                System.out.println(1);
            }
            // Block 6:
            else {
                // Block 7:
                System.out.println(0);
            }
        }
        // Block 8:
        else {
            // Block 9:
            if (m2 == 1) {
                // Block 10:
                System.out.println(1);
            }
            // Block 11:
            else {
                // Block 12:
                System.out.println(0);
            }
        }
        // Block END.
    }
    }

