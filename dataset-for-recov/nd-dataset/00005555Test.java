import org.junit.jupiter.api.Test;

class ConvertedTest {
    @Test
    public void testMainLogic() {
        // Block 1:
        int n = 2;
        // Block 2:
        int a = 0;
        // Block 3:
        if (n % 2 == 0) {
            // Block 4:
            a = n / 2;
        } else {
            // Block 5:
            a = n / 2 + 1;
        }
        // Block 7:
        System.out.println(a);
        // Block END.
    }
    }

