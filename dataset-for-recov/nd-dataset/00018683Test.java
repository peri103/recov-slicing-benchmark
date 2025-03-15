import org.junit.jupiter.api.Test;

class _00018683Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 3;
        // Block 2:
        int w = 7;
        // Block 3:
        int n = 10;
        // Block 4:
        int lines = 0;
        // Block 5:
        int act = 0;
        // Block 6:
        if (h <= w) {
            // Block 7:
            lines = h;
            // Block 8:
            act = w;
        }
        // Block 9:
        else {
            // Block 10:
            lines = w;
            // Block 11:
            act = h;
        }
        // Block 12:
        int draw = 0; 
        // Block 13:
        for (int i = 0; i < lines; i++) {
            // Block 14:
            if (n <= (i + 1) * act) {
                // Block 15:
                System.out.println(i + 1);
                // Block 16:
                break;
            }
        }
        // Block END.
    }
    }

