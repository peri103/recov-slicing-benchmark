import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int div = 0;
        // Block 2:
        int mod = 0;
        // Block 3:
        int h = 14;
        // Block 4:
        int w = 12;
        // Block 5:
        int n = 112;
        // Block 6:
        if (h > w) {
            // Block 7:
            div = n / h;
            // Block 8:
            mod = n % h;
        }
        // Block 9:
        else {
            // Block 10:
            div = n / w;
            // Block 11:
            mod = n % w;
        }
        // Block 12:
        if (mod > 0) {
            // Block 13:
            System.out.println(div + 1);
        }
        // Block 14:
        else {
            // Block 15:
            System.out.println(div);
        }
        // Block END.
    }
    }

