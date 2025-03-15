import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 10, a = 7, b = 5;
        // Block 2:
        n = Integer.parseInt(String.valueOf(n));
        // Block 3:
        a = Integer.parseInt(String.valueOf(a));
        // Block 4:
        b = Integer.parseInt(String.valueOf(b));
        // Block 5:
        int mx_x;
        if (a > b) {
            // Block 6:
            mx_x = b;
        // Block 7:
        } else {
            // Block 8:
            mx_x = a;
        }
        // Block 9:
        int mx_y;
        if ((a + b - n) < 0) {
            // Block 10:
            mx_y = 0;
        // Block 11:
        } else {
            // Block 12:
            mx_y = a + b - n;
        }
        // Block 13:
        System.out.println(mx_x + " " + mx_y);
        // Block END.
    }
    }
}
