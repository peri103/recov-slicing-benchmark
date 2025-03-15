import org.junit.jupiter.api.Test;

class _00019076Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 12;
        // Block 2:
        if (n % 2 == 1) {
            // Block 3:
            System.out.println(0);
        }
        // Block 4:
        else {
            // Block 5:
            int i = 0;
            // Block 6:
            int a = n / 10;
            // Block 7:
            int b = 1;
            // Block 8:
            while (b != 0) {
                // Block 9:
                i += 1;
                // Block 10:
                b = n / ((int) (Math.pow(5, i) * 10));
                // Block 11:
                a += b;
            }
            // Block 12:
            System.out.println(a);
        }
        // Block END.
    }
    }

