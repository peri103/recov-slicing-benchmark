import org.junit.jupiter.api.Test;

class _00018362Test {
    @Test
    public void testMainLogic() {
        // Block 1:
        int h = 3;
        // Block 2:
        int w = 7;
        // Block 3:
        int n = 10;
        // Block 4:
        int count = 0;
        // Block 5:
        int a, b;
        if (h < w) {
            // Block 6:
            a = w;
            // Block 7:
            b = h;
        // Block 8:
        } else {
            // Block 9:
            a = h;
            // Block 10:
            b = w;
        }
        // Block 11:
        int x = n / a;
        // Block 12:
        if (n % a != 0) {
            // Block 13:
            x += 1;
        }
        // Block 14:
        System.out.println(x);
        // Block END.
    }
    }

